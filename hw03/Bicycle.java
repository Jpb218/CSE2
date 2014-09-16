//Justin Brock-Smith
//9/14/14
//Bicycle hw01
//cse002

//allows us to take input from user
import java.util.Scanner;
//define the class
public class Bicycle{
    
    //define main method
    public static void main(String[] args){
        double wheelDiameter = 27,
        Pi=3.14159,
        feetpermile = 5280,
        inchesperFoot = 12;
        
        Scanner bicycleInput;//this creates the Scanner for us to input values
        bicycleInput = new Scanner( System.in );//sets the scanner as next input from user
        System.out.print("Please enter the ammount of seconds: ");
        int nSeconds =bicycleInput.nextInt();//this accepts the ammount of seconds from the user
        System.out.print("Now please enter the ammount of counts: ");
        int nCounts =bicycleInput.nextInt();//this accepts the ammount of counts from the user
        double distanceTrip=((nCounts*Pi*wheelDiameter)/(feetpermile*inchesperFoot))*100;//this finds the distance of the trip in miles, times 100 to reduce decimal points
        int distanceSimplified= (int) distanceTrip;
        double distanceSimplifiedDouble= (double) distanceSimplified;
        distanceSimplifiedDouble/=100;//this reduces the distance to only two decimal places
        double timeTrip=(nSeconds/60);//this finds the time of the trip in seconds
        System.out.println("The trip was "+distanceSimplifiedDouble+" miles long, and took "+timeTrip+" minutes.");
        double avgMPH=100*((distanceSimplifiedDouble/(timeTrip/60)));//this finds the average miles per hour
        int avgMPHSimplified= (int) avgMPH;
        double avgMPHNew= ((double) avgMPHSimplified)/100;
        System.out.println("The average miles per an hour of this trip was "+avgMPHNew+".");
        
        
        
    }
}
