//Justin Brock-Smith //9/23/14 //CourseNumber hw04 //CSE002 
import java.util.Scanner;//imports a scanner 
//define the class 
public class CourseNumber{
    //add main method
    public static void main(String[] args){
        Scanner courseScan;//creates Scanner
        courseScan= new Scanner(System.in);//sets scanner as next input
        System.out.print("please enter your six digit course number: ");
        if(courseScan.hasNextInt()){
        double courseNumb=courseScan.nextInt();//creates scanner and gives it next input
            if(courseNumb>=186510&&courseNumb<=201440){//this makes sure it is in the given range
            courseNumb/=100;
            int courseYear = (int) courseNumb;//to delete the last two digits
            double courseNumbOnly=(courseNumb-courseYear);//to give only the last two digits
            courseNumbOnly*=100;
            int courseNumbInt= (int) courseNumbOnly;
            if(courseNumbInt==10){//corresponds to spring
                System.out.println("This is in the spring semester of "+courseYear);
            }
            else if(courseNumbInt==20){//corresponds to summer 1
                System.out.println("This is in the Summer 1 semester of "+courseYear);
            }
            else if(courseNumbInt==30){//corresponds to summer 2
                System.out.println("This is in the Summer 2 semester of "+courseYear);
            }
            else if(courseNumbInt==40){//40 corresponds to fall
                System.out.println("This is in the Fall semester of "+courseYear);
            }
            else{
            System.out.println("that is not a proper course number.");
            return;//this deals with if the last two digits are not one of the four season choices.
            }
            
            }
            else{
            System.out.println("that number is not in the proper range.");
            return;
            //this ends the program if the user does not enter a number in the possible range
            }
            
        }
        else{
        System.out.print("This is not an integer.");
        return;
        }//this ends the program if the user fails to input an integer
    }
    
}