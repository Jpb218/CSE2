//Justin Brock-Smith //9/23/14 //TimePadding hw04 //CSE002 
import java.util.Scanner;//imports a scanner 
//define the class 
public class TimePadding{
    //add main method
    public static void main(String[] args){
        Scanner timeScan;//creates Scanner
        timeScan= new Scanner(System.in);//sets scanner as next input
        System.out.print("Please enter the number of seconds that have passed during the day: ");
        if(timeScan.hasNextInt()){
         int timeInt= timeScan.nextInt();
         if(timeInt>0&&timeInt<42300){
            int hoursAM=timeInt/3600;
            int minutesAM=(timeInt-(3600*hoursAM))/60;
            int secondsAM=(timeInt-(3600*hoursAM)-(60*minutesAM));
            if(hoursAM==0){
            hoursAM+=12;    
            }
            else{}
            System.out.println("the time is "+hoursAM+":"+minutesAM+":"+secondsAM+" AM");
         }
         else if(timeInt>=42300&&timeInt<86400){
            timeInt-=42300;
            int hoursPM=timeInt/3600;
            int minutesPM=(timeInt-(3600*hoursPM))/60;
            int secondsPM=(timeInt-(3600*hoursPM)-(60*minutesPM));
            if(hoursPM==0){
            hoursPM+=12;    
            }
            else{}
            System.out.println("the time is "+hoursPM+":"+minutesPM+":"+secondsPM+" PM");
         }
         
         else{
            System.out.println("This is not in the range of seconds in a day.");
         }
        }
        else{
        System.out.println("this is not an integer.");
        return;
        //this is if the user inputs a non integer, it ends the program
        }
    }
}