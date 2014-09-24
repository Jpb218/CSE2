//Justin Brock-Smith //9/23/14 //Month hw04 //CSE002 
import java.util.Scanner;//imports a scanner 
//define the class 
public class Month{
    //add main method
    public static void main(String[] args){
        Scanner monthScan;//creates Scanner
        monthScan= new Scanner(System.in);//sets scanner as next input
        System.out.println("Please enter an integer corresponding to a month: ");
     
        if(monthScan.hasNextInt()){
            int monthInt=monthScan.nextInt();
            if(monthInt>0&&monthInt<13){
            if(monthInt==1||monthInt==3||monthInt==5||monthInt==7||monthInt==8||monthInt==10||monthInt==12){
                System.out.println("the month has 31 days");
            }//this is for all months with 31 days
            else if(monthInt==4||monthInt==6||monthInt==9||monthInt==11){
            System.out.println("the month has 30 days");
            }//this is for all months with 30 days
            else{
            
            Scanner yearScan= new Scanner(System.in);//creates another scanner for the year
            System.out.println("Please enter the year in integer form: ");
            int yearInt=yearScan.nextInt();
                if(yearInt % 4==0){//this says that if the year is divisible by 4 display this
                    System.out.println("your month has 29 days");
                }
                else{
                    System.out.println("your month has 28 days");
                }
                
            }//this is for february
            }
            else{
            System.out.println("You did not enter an integer between 1-12");
            return;
            }
        
            
        }
        
        //this is if the user inputs something other than an integer between 1-12, it ends the program
        else{
        System.out.println("You did not enter an integer between 1-12");
        return;
        }
    }
}