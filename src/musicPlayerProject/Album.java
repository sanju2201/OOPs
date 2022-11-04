package musicPlayerProject;

import java.lang.*;
import java.util.*;

public class Album {

    private  String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album() {
        this.name = name;
        this.artist = artist;
        this.songs = songs;
    }

    // Adding song after checking as that song is not available on the playlist
    public boolean addsong(String title,double duration){
        if(findSong(title)== null){
            songs.add(new Song(title,duration));
           // System.out.println(title +" successfully added to playlist");
            return true;
        }
        else{
           // System.out.println("Song with this name "+title +" already available in the playlist.");
            return false;
        }
    }

    // checking is the song is already available on the playlist or not.
    public Song findSong(String title){
        for(Song x : songs){
            if(x.getTitle().equals(title)){
                return x;
            }
        }
        return null;
    }

    // checking the song is it available on the Arraylist or not
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> Playlist){
     // convert tracckNumber to indexing . tracknumber have 1 indexing and index have 0 indexing
       int index= trackNumber-1;
       if(index>0 && index<= this.songs.size()){
           Playlist.add(this.songs.get(index));
           return true;
       }
      //  System.out.println("This album does not have song with trackNumber");
       return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song>Playlist){
        for(Song checkSong : this.songs){
            if(checkSong.getTitle().equals(title)){
                Playlist.add(checkSong);
                return true;
            }
        }
       // System.out.println(title+ " there is no such song in album.");
        return false;
    }

}
