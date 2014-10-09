import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *  By running the program I got an error that tells me specifically that there is an
 *  arithmetic exception that something cannot be divided by 0. Knowing this new information,
 * I simply deleted the /0 partof the program so there would be no runtime error.
 * 
 * 
 */

