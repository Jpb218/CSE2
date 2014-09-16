//Justin Brock-Smith
//9/14/14
//Root hw01
//cse002

//allows us to take input from user
import java.util.Scanner;
//define the class
public class FourDigits{
    
    //define main method
    public static void main(String[] args){
    Scanner fourDigits;//this creates our scanner
    fourDigits = new Scanner(System.in);//sets the scanner to be the next input
    System.out.print("input any number and I will display the first four digits after the decimal point: ");
    double anyNumber=fourDigits.nextDouble();//sets the number input as a double
    double onlyDecimals=anyNumber - (int)anyNumber;//this sets a new number that is our original double minus its int form, making it only decimals
    onlyDecimals*=10000;
    int fourDecimals=(int)onlyDecimals;
    System.out.print("the first four digits after the decimal point of your number are: "+fourDecimals);
    double finalNumber =(double)fourDecimals;
    finalNumber /=10000;
    System.out.println(" or, "+finalNumber);
    
    
    }
}