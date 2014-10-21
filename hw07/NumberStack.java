//Justin Brock-Smith
//10/21/2014
//CSE002
//hw07 NumberStack

import java.util.Scanner; //import the scanner

public class NumberStack { //create a class
    public static void main(String[] args) { //create a main method
        Scanner input = new Scanner(System.in); //makes scanner
        System.out.println("What number do you choose?");
        int printNumb = 1; //this sets the number that will be printed, until we get to the final number they inputted

        if (input.hasNextInt()) { //checks to see if the input has an integer
            int inNumb = input.nextInt(); //saves the input
            if (inNumb < 10 && inNumb > 0) { //checks to make sure the input is in the range of 1-9
                for (int i = 0; i < inNumb; i++) {


                    int rowNumb = 2 * printNumb - 1; //sets the initial ammount of rows that will be printed
                    int finalRowNumb = 2 * inNumb - 1; //sets the final ammount of rows that will be printed


                    for (int q = 0; q < printNumb; q++) {
                        for (int z = 0; z < ((finalRowNumb - rowNumb) / 2); z++) { //this creates the right ammount of spaces before the number
                            System.out.print(" ");
                        } //happens until we get back to the pyramid shape
                        for (int j = 0; j < rowNumb; j++) {
                            System.out.print(printNumb); //this prints out the number until that row is finished
                        }

                        System.out.println(" "); //creates a space so as to go to the next line

                    }

                    for (int z = 0; z < ((finalRowNumb - rowNumb) / 2); z++) {
                        System.out.print(" ");
                    } //this does the same thing as the first time, creating space before the -'s
                    for (int x = 0; x < rowNumb; x++) {
                        System.out.print("-");
                    } //this creates the seperator for each new array of numbers
                    printNumb++; //this adds one to the print number to create the new array
                    System.out.println(" ");

                }
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");

                int u = 0;

                int printNumb1 = 1; //this sets the number that will be printed, until we get to the final number they inputted



                
                    while (u < inNumb) {


                        int rowNumb1 = 2 * printNumb1 - 1; //sets the initial ammount of rows that will be printed
                        int finalRowNumb1 = 2 * inNumb - 1; //sets the final ammount of rows that will be printed
                        int a =0;

                        while (a < printNumb1) {
                            int p=0;
                            while (p < ((finalRowNumb1 - rowNumb1) / 2)) { //this creates the right ammount of spaces before the number
                                System.out.print(" ");
                                p++;
                            } //happens until we get back to the pyramid shape
                            int t=0;
                            while (t < rowNumb1) {
                                System.out.print(printNumb1); //this prints out the number until that row is finished
                                t++;
                            }

                            System.out.println(" "); //creates a space so as to go to the next line
                            a++;
                        }
                        int k=0;
                        while (k < ((finalRowNumb1 - rowNumb1) / 2)) {
                            System.out.print(" ");
                            k++;
                        } //this does the same thing as the first time, creating space before the -'s
                        int l=0;
                        while (l < rowNumb1) {
                            System.out.print("-");
                            l++;
                        } //this creates the seperator for each new array of numbers
                        printNumb1++; //this adds one to the print number to create the new array
                        System.out.println(" ");
                        u++;
                    }

                
                
                
                
                
                
                
                
                
                
                
                
                
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");

                int y = 0;

                int printNumb2 = 1; //this sets the number that will be printed, until we get to the final number they inputted



                
                    do{


                        int rowNumb2 = 2 * printNumb2 - 1; //sets the initial ammount of rows that will be printed
                        int finalRowNumb2 = 2 * inNumb - 1; //sets the final ammount of rows that will be printed
                        int b =0;

                        do{
                            int d=0;
                            do{ //this creates the right ammount of spaces before the number
                                if(d==((finalRowNumb2 - rowNumb2) / 2)){//the if statement makes sure that this does not happen automatically when it shouldn't
                                    
                                }
                                else{
                                    System.out.print(" ");
                                }
                                d++;
                            }while (d < ((finalRowNumb2 - rowNumb2) / 2)); //happens until we get back to the pyramid shape
                            int h=0;
                            do{
                                System.out.print(printNumb2); //this prints out the number until that row is finished
                                h++;
                            }while (h < rowNumb2);

                            System.out.println(" "); //creates a space so as to go to the next line
                            b++;
                        }while (b < printNumb2);
                        int w=0;
                       do{
                            if(w==((finalRowNumb2-rowNumb2)/2)){
                                
                            }
                            else{
                            System.out.print(" ");
                            }
                            w++;
                            
                        }while (w < ((finalRowNumb2 - rowNumb2) / 2)); //this does the same thing as the first time, creating space before the -'s
                        int o=0;
                        do{
                            System.out.print("-");
                            o++;
                        }while (o<rowNumb2); //this creates the seperator for each new array of numbers
                        printNumb2++; //this adds one to the print number to create the new array
                        System.out.println(" ");
                        y++;
                    }while (y < inNumb);
            }
            else { //this deals with integers not between 10 and 0
                System.out.println("This is not a correct integer.");
            }

        }
        else { //this deals with numbers that are not integers
            System.out.println("This is not an integer.");
        }





















    }
}