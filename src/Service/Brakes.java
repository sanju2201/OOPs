package Service;
import java.util.*;

public class Brakes {

    int NoOfBrakes;
    String type;

    Brakes(int brakes, String type){
     this.NoOfBrakes = brakes;
     this.type = type;
    }

    public static void pressBrake(String brake){
        System.out.println("You have Press the "+ brake + " brake. ");
    }

    public int getNoOfBrakes() {
        return NoOfBrakes;
    }

    public String getType() {
        return type;
    }

    public void setNoOfBrakes(int noOfBrakes) {
        this.NoOfBrakes = noOfBrakes;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String []args){
        //Brakes.pressBrake("Front");

        Brakes fb = new Brakes(2,"Front");
        Brakes bb = new Brakes(2,"Back");

        fb.pressBrake("Front");
        bb.pressBrake("Back");
    }

}
