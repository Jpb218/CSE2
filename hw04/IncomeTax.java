//Justin Brock-Smith //9/23/14 //IncomeTax hw04 //CSE002 
import java.util.Scanner;//imports a scanner 
//define the class 
public class IncomeTax{
    //add main method
    public static void main(String[] args){
        Scanner taxIncome;//creates Scanner
        taxIncome= new Scanner(System.in);//sets scanner as next input
        System.out.print("Please enter your income in thousands of dollars as an integer. ");
        if(taxIncome.hasNextInt()){
            int incomeInteger = taxIncome.nextInt();
            if (incomeInteger>0){ 
            if(incomeInteger<20){
            System.out.println("Your income tax is 5%, so your income tax is "+(incomeInteger*.05+" thousand dollars"));
            }//this if statement deals with if the income is less than 20,000
            else if(incomeInteger>=20&&incomeInteger<40){
            System.out.println("Your income tax is 7%, so your income tax is "+(incomeInteger*.07)+" thousand dollars");
            }//this if statement deals with if the income is less than 40,000 but more than 20,000
            else if(incomeInteger>=40&&incomeInteger<78){
            System.out.println("Your income tax is 12%, so your income tax is "+(incomeInteger*.12)+" thousand dollars");
            }//this if statement deals with if the income is less than 78,000 but more than 40,000
            else if(incomeInteger>=78){
            System.out.println("Your income tax is 14%, so your income tax is "+(incomeInteger*.14)+" thousand dollars");
            }//this if statement deals with if the income is more than 78,000
            }
            //this statement ends the program if the integer is not positive
            else{
            System.out.println("You must enter a positive income.");
            return;
            }
            }
                
        //ends the program if they did not enter an integer
        else{
        System.out.println("You did not enter an integer, this is required.");
        return;//ends the program
        }
    }
}
