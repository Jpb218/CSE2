import java.util.Scanner;
public class BlockedAgain{//main class
public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);
}//this is all the original code that simply contains the necessary methods.
public static void allBlocks(int m){//method allBlocks does the printing out of the code
   for(int q=0; q<=m; q++){
    for(int i=0; i<q; i++){
        block(q, m);//calls block method to print out the numbers
        System.out.println(" ");//makes a space after each line
    }
    for(int k=0; k<m-q; k++){
        System.out.print(" ");//creates the same number of indents for the -'s as for the numbers    
        }
    for(int p=0; p<2*q-1; p++){
        System.out.print("-");//creates as many dashes as numbers above the dash
    }
   
    
    System.out.println(" ");//starts a new line to spread code out
   }
}
public static void block(int q, int m){//inside allBlocks method
    for(int k=0; k<m-q; k++){
    System.out.print(" ");    //creates the right number of indents before the line method
    }
    line(q);
}
  public static void line(int m){
     for(int j=0; j<(2*m-1); j++){
    System.out.print(m);//this prints out the actual numbers the right ammount of times, aka 2*the number - 1
     }
  }

public static int getInt(){//this checks to make sure the input is ok
    System.out.print("Input an integer please- ");
    Scanner scan= new Scanner(System.in);//calls scanner
    boolean integerTF, rangeTF=false; //makes sure the program runs once before resetting to see if it needs to go again
    int inNumb=0;
    while(rangeTF==false){//loops it until they are in the proper range
    integerTF= checkInt(scan);//calls method checkInt to see if they have an int
    while(integerTF==false){//loops it until they have the proper integer, if they do not it loops again
    scan.next();
    integerTF=checkInt(scan);//
    }
    inNumb=scan.nextInt();
    rangeTF=checkRange(inNumb);//checks the range of the int once it has been entered
    }

    return inNumb;//returns the now correct int
    
    
    
}
public static boolean checkInt(Scanner scan){//check int simply checks to see if they entered an int or not and returns true if they did
    if(scan.hasNextInt()){
        return true;
    }
    else{
        System.out.println("Sorry that is not a valid integer, try again:");
        return false;
    }
}
public static boolean checkRange(int a){//this checks f they entered a number in the range and returns true if they did
    if(a>0&&a<10){
        return true;
    }
    else{
        System.out.println("Your number is not in the range 1-9, try again:");
        return false;
    }
}
}
