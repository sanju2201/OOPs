package musicPlayerProject;
import java.lang.*;
import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

  Album album = new Album("Album1","Arijit");
        album.addsong("kkr",4.5);
        album.addsong("lak",3.5);
        album.addsong("ddlj",4.0);
        album.addsong("kkkg",2.5);
        albums.add(album);

        album = new Album("Album2","kumarsanu");

        album.addsong("ppkl",5.3);
        album.addsong("gdbg",2.3);
        album.addsong("hhnnl",3.5);
        album.addsong("jghm",4.0);
        albums.add(album);

        LinkedList<Song> playlist_01 = new LinkedList<>();
        albums.get(0).addToPlaylist("Hits",playlist_01);
        albums.get(0).addToPlaylist("old",playlist_01);
        albums.get(1).addToPlaylist("new",playlist_01);
        albums.get(1).addToPlaylist("90s",playlist_01);

        play(playlist_01);


    }

    private  static void play(LinkedList<Song> playlist){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        if(playlist.size()==0){
            System.out.println("This playlist has no songs");
        }
        else{
            System.out.println("Now Playing" + listIterator.next().toString());
         printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){
                case 0:
                    System.out.println("PlayList complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+ listIterator.next().toString());
                    }
                    else{
                        System.out.println("Wo songs Available, we reach to the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                        listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+ listIterator.previous().toString());
                    }
                    else{
                        System.out.println("We are at the first Song");
                        forward = false;
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+ listIterator.previous().toString());
                       forward = false;
                        }
                        else{
                            System.out.println("We are at the atart of the list");

                        }
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next().toString());
                         forward = true;
                        }
                        else{
                            System.out.println("We reached to the end of the list");

                        }
                        break;

                    }

                case 4:
                    printlist(playlist);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playlist.size()> 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next().toString());
                        }
                        else{
                            if(listIterator.hasPrevious()){
                                System.out.println("Now playing "+ listIterator.previous().toString());
                            }
                        }
                    }

            }

        }
    }

    private static  void printMenu(){
        System.out.println("Available Option \n press");
        System.out.println("0 - to quit \n"+" " +
                "1 - to play next song \n"+
                "2 - to play privious song \n"+
                "3 - to replay the current song \n"+
                "4 - list of all sonds \n"+
                "5 - print all available options \n"+
                "6 - delete current song ");
    }


    private  static  void printlist(LinkedList<Song>playlist){
        Iterator<Song> iterator = playlist.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------------");
    }


}
