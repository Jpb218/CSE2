//Justin Brock-Smith
//10/28/14
//CSE 002


import java.util.Scanner;//import Scanner
public class HW8 {//creates class
    public static void main(String[] arg) {//creats first method (main)
        char input;

        Scanner scan = new Scanner(System.in);//creates new Scanner
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");//calls first method
        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {//this works to make sure we do not print a space
            System.out.println("You entered '" + input + "'");
        }
        else{//this ends the program if it is a space, because that means they ran it 5 times without giving a char
            return;
        }
    	input=getInput(scan,"Choose a digit.","0123456789");
        System.out.println("You entered '" + input + "'");
    }
    public static char getInput(Scanner scan, String a) {//first method uses a scanner, string
        while (true) {//creates loop unril we get a return statement
            char l = scan.next().charAt(0);//sets char to be the first char they input
            if (l == a.charAt(0)) {//sees if this char equals the first char in the string "Cc"
                return a.charAt(0);

            }
            else if (l == a.charAt(1)) {//sees if this char equals second char in the string "Cc"
                return a.charAt(1);

            }
            else {//this checks to see if they did not enter the correct character
                System.out.print("This is not a correct input try again- ");
            }
        }//end of first overstacked method

    }
    public static char getInput(Scanner scan, String b, int c) {//second method uses scanner, string, and int as parameters
        for (int i = 0; i < c; i++) {//this makes it go only as long as c states (5 times)
            char p = scan.next().charAt(0);//sets p to be the first char they input
            if (p == b.charAt(0)) {//sees if p equals the first char in the string
                return b.charAt(0);

            }
            else if (p == b.charAt(1)) {//checks to see if p equals the second char in the string
                return b.charAt(1);

            }
              else if (p == b.charAt(2)) {//checks for third char in the string
                return b.charAt(2);

            }
               else if (p == b.charAt(3)) {//checks for fourth char in the string
                return b.charAt(3);

            }
            else {//this is if it does not equal any of the chars
                System.out.print("This is not a correct input try again- ");
            }
        }
        String f=" ";//makes f a space if this happens four times, which eventually quits the program (see above code)
        return f.charAt(0);
    }
    public static char getInput(Scanner scan, String a, String b){//third and final overstacked method
        while(true){//always runs
            System.out.println(a);//prints out "enter a digit"
            
            if(scan.hasNextInt()){//makes sure the digit is an integer
                
                int f=scan.nextInt();
                if(f>-1&&f<10){//makes sure the int is in the range
                    
                 String d="";//initializes d so we can add an int
                 d+=f;//adds the entered int value to make it a string
                int x=0;
                    while(true){//always runs until the character they entered equals a character in the string
                        if(d.charAt(0)==b.charAt(x)){
                        return d.charAt(0);    
                        }   
                        x++;//adds one if we do not get a return value so that we can check each character in the string
                    }
                }
                else{//if the input is not in the range of 1-9
                    System.out.println("This integer is not in the range.");
                }
            }
            else{//if the input is not an integer
                System.out.println("You did not enter an integer.");
            }
        }
    }

}
