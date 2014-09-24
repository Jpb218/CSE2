//Justin Brock-Smith //9/19/14 //BigMacAgain lab04 //CSE002 
import java.util.Scanner;//imports a scanner //define the class 
public class BigMacAgain{
    //add main method
    public static void main(String[] args){
   Scanner bigMac2Input;//creates the scanner
   bigMac2Input = new Scanner(System.in);//sets scanner as next input
   System.out.print("How many Big Macs did you purchase?");
   //this if else statement finds out whether or not an integer was entered
   if(bigMac2Input.hasNextInt()){
       //setting an integer equal to the number of Big Macs
        if(BigMac2Input>0){//this is to see whether the number of Big Macs is positive
        System.out.println("You ordered "+numbBigMacs+" for a total cost of $2.22*"+numbBigMacs+"="+(numbBigMacs*2.22));
        System.out.print("Would you like fries as well? (Y,y,N,n)");
        Scanner bigMac3Input;
        bigMac3Input.NextString();//sets fries equal to next string
            if(bigMac3Input.equals("Y"||"y")){
            System.out.println("Your new total is $"+(numbBigMacs*2.22)+"+$2.15="+(2.15+numbBigMacs*2.22));
            //this is the output for fries, simply adds that cost to the total cost
            }else if(bigMac3Input.equals("N"||"n")){
            System.out.println("Your total cost remains at $"+(numbBigMacs*2.22));
            //this outputs the final cost if you do not get fries
            }else{
            System.out.println("You did not enter Y,y,N or n :(");
            return;//this is if the user does not enter one of the accepted values
            }
        }
        else {
        System.out.println("You did not enter a positive integer");
        return;
        }//this is if the user does not input a positive integer
   }
   //the else statement is here if the user inputs something other than an integer for the number of Big Macs
   else{
   System.out.println("You did not enter an integer, this is required.");
   return;//ends the program
   }
    }//end of method
}//end of class
