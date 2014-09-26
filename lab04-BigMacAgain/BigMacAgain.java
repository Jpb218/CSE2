//Justin Brock-Smith //9/19/14 //BigMacAgain lab04 //CSE002 
import java.util.Scanner;//imports a scanner //define the class 
public class BigMacAgain{
    //add main method
    public static void main(String[] args){
   Scanner bigMac2Input;//creates the scanner
   bigMac2Input = new Scanner(System.in);//sets scanner as next input
   System.out.print("How many Big Macs did you purchase? ");
   //this if else statement finds out whether or not an integer was entered
   if(bigMac2Input.hasNextInt()){
       //setting an integer equal to the number of Big Macs
       int numbBigMacs=(int) bigMac2Input.nextInt();
        if(numbBigMacs>0){//this is to see whether the number of Big Macs is positive
        int firstTotalInt= (int) (100*(numbBigMacs*2.22));
        double firstTotalDoub=((double) firstTotalInt)/100;
        System.out.println("You ordered "+numbBigMacs+" for a total cost of $2.22*"+numbBigMacs+"=$"+(firstTotalDoub));
        System.out.print("Would you like fries as well? (Y,y,N,n) ");
        Scanner bigMac3Input;
        bigMac3Input = new Scanner(System.in);//sets fries equal to next string
        
            if(bigMac3Input.next().equals("Y")||bigMac3Input.next().equals("y")){
            
            System.out.println("Your new total is $"+(firstTotalDoub)+"+$2.15=$"+(2.15+firstTotalDoub));
            //this is the output for fries, simply adds that cost to the total cost
            }else if(bigMac3Input.next().equals("N")||bigMac3Input.next().equals("n")){
            System.out.println("Your total cost remains at $"+(firstTotalDoub));
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
