//Justin Brock-Smith
//9-12-14
//CSE002
//BigMac

//This program will take inputs from the user such as the number of big macs, how much they cost and what state they are from, and it will display to them the final cost.
import java.util.Scanner;

//define a class
public class BigMac {
    //define a main method
    public static void main(String[] args){
    //this will allow us to accept input from the user  
    Scanner bigMacinput;
    bigMacinput = new Scanner( System.in );
    System.out.print(
        "Enter the number of Big Macs(an integer>0) ");
        int nBigMacs = bigMacinput.nextInt();
    System.out.print("Enter the cost per a Big Mac as a double (in the form xx.xx): ");
    double bigMac$ = bigMacinput.nextDouble();
    System.out.print("Enter the percent tax as a whole number (xx): ");
    double taxRate = bigMacinput.nextDouble();
    taxRate/=100; //this converts the taxes to a proportion instead of a percent
    double cost$;
    int dollars, dimes, pennies; //to store digits right of the decimal point
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    dollars=(int) cost$;//cost in dollars
    dimes=(int)(cost$*10)%10;//to display dimes
    pennies=(int)(cost$*100)%10;//to display pennies
    System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+ bigMac$+
    " per a Big Mac, with a sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
    
    
    
    
        
        
    } //end of main method
} //end of class
