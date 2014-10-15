    //Justin Brock-Smith
    //10/10/14
    //LoopTheLoop lab07
    //CSE002
    
    
    import java.util.Scanner;//imports the scanner
    //define the class
    public class LoopTheLoop{
    //add a main method
    
    public static void main(String[] args) {
    Scanner starLoop= new Scanner(System.in);//sets Scanner
    String again="y";//this begins the while loop by setting the String
    while(true){//this while loop continues until the break
    
    while(again.equals("Y")==true||again.equals("y")==true){//this while loop continues until the user says stop, then hits a break
        
    
    System.out.println("How many stars do you choose? (int between 0 and 16)");
    boolean valid=true;//this sets the valid boolean so as to run an error statement if this does not run.
    
    if(starLoop.hasNextInt()){
    int nStars= (int) starLoop.nextInt();//# of stars they want
    int totalStars=0;
    int totalStars2=totalStars;//these ints will add until they hit nStars to deal with the ammount of stars
    while(0<=nStars && nStars<=15){//this only runs in the int value is in the range
    while(totalStars<nStars){//this only runs if totalStars has not reached nStars
    System.out.print("*");
    totalStars++;//this adds to total stars so eventually it will reach nStars and end the program
    }
    System.out.println(" ");
    int i=-1;
    
    for(totalStars2 = 0; totalStars2 < nStars; totalStars2++) {
        for(i = -1; i < totalStars2; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    valid=false;//this shows that the above code has run so that the error code does not show
    break;    
        
    }
    }
    
    while(valid==true){//this error code shows if the code did not run (not an int between 0 and 16)
        System.out.println("This is not a valid integer.");
        break;
    }
    System.out.println("Would you like to continue? (Y, y)");
    again=starLoop.next();//this asks the user if they want to continue
    }
    break;//if the user says no they end the program
    }
    }
    }