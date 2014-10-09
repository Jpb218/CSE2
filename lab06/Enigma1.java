/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a proportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double proportion;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    int y=((new Scanner(System.in)).nextInt());
   System.out.println("You entered "+y+"%");
   double x= y;
   //print out the proportion remaining for select percentages
   if(1-x/100==0.93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(1-x/100==0.59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(1-x/100==0.86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(1-x/100==0.67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(1-x/100==0.4)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
     else if(x<100 && x>=0){
         proportion=(1-x/100);
        System.out.printf("The proportion remaining is %.2f", proportion);
     }
         
     }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *  One error was that the input was accepting all doubles.
 * By changing the variable accepted to an integer we eliminate inputs we don't want.
 * The extra else if statement I added gives a proportion to all of the other valid inputs only.
 * I also added %.2f which makes sure the proportion given is only 2 decimal points
 */

