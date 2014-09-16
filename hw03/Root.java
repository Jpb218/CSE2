//Justin Brock-Smith
//9/14/14
//Root hw01
//cse002

//allows us to take input from user
import java.util.Scanner;
//define the class
public class Root{
    
    //define main method
    public static void main(String[] args){
    Scanner rootInput;//this creates our scanner to input a value into
    rootInput = new Scanner(System.in);//sets the scanner to next input
    System.out.print("Input a number and I will guess it's cube root: ");
    double inputNumber= rootInput.nextDouble();//creates a double of the input number
    double guess= inputNumber/3;
    double guess2= (2*guess*guess*guess+inputNumber)/(3*guess*guess);
    double guess3=(2*guess2*guess2*guess2+inputNumber)/(3*guess2*guess2);
    double guess4= (2*guess3*guess3*guess3+inputNumber)/(3*guess3*guess3);
    double guess5= (2*guess4*guess4*guess4+inputNumber)/(3*guess4*guess4);//these lines are all simply adjusting our guess to get closer to a cube root
    double guess6= (2*guess5*guess5*guess5+inputNumber)/(3*guess5*guess5);
    System.out.println("The cube root is about "+guess6+":");//outputting our fifth guess
    System.out.println(guess6+"*"+guess6+"*"+guess6+" = "+ (guess6*guess6*guess6));//and what the guess is cubed
    
    
    
    }
}//end of program