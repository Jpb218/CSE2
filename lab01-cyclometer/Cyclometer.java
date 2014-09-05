//Justin Brock-Smith
//9/5/14
//CSE02
//The purpose of this program is to be able to begin to use java as a calculator
//it will calculate minutes and cycles per a minute, as well as distance of each trip and what they add to
public class Cyclometer {
    //main method
    public static void main(String[] args) {
        int trip1=480; //the number of seconds for trip 1
        int trip2=3220; //the number of seconds for trip 2
        int count1=1561; //the count for trip 1
        int count2=9037;//the count for trip 2
        double wheeldiameter=27, //wheel diameter of cycle
        Pi=3.14159, //value of pi
        feetpermile=5280,//feet in a mile
        InchesperFoot=12, //inches in a foot
        secondsperminute=60; //seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //these are the final distances of each trip
        System.out.println("Trip 1 was "+ (trip1/secondsperminute)+ 
        " minutes long, and had "+ count1 + " counts.");
        System.out.println("Trip 2 was "+ (trip2/secondsperminute)+ 
        " minutes long, and had "+ count2+ " counts.");
        //running the calculations for each distance here
        distanceTrip1=count1*wheeldiameter*Pi;
        distanceTrip2=count2*wheeldiameter*Pi;
        //this finds the distance in inches by multiplying Count by the diamter of the wheel by pi
        distanceTrip1/=InchesperFoot*feetpermile;
        distanceTrip2/=InchesperFoot*feetpermile;
        //this converts the distance into miles
        System.out.println("Trip 1 was "+(distanceTrip1)+ " miles long");
        System.out.println("Trip 2 was "+(distanceTrip2)+ " miles long");
        System.out.println("The total distance was "+ (distanceTrip1+distanceTrip2) +" miles long.");
        
        
    } //main method stop
} //class stop

