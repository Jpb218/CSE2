//Justin Brock-Smith
//CSE002
//hw06-Root.java
//10/14/14
//the purpose of this program is to use a mathematical equation to approximate the square root of a number

import java.util.Scanner;
public class Root{
    //add main class
    public static void main(String[] args){//add main method
        double low=0, middle=0;
   
        Scanner inputNumber= new Scanner(System.in);//set scanner
        System.out.println("Please input a number greater than 0.");
        if(inputNumber.hasNextDouble()){//checking to see if input number is in fact a number
        double x= inputNumber.nextDouble();
        double high=1+x;//setting high to be 1+x, which squared will always be bigger than x^2
          
         
        if(x>0){//checks to see if x is positive
            
            while(high-low>.000001){//this is to make sure the difference between high and low gets small enough to get a good approximation
                
                    middle=(high+low)/2;//sets the middle each time as the new middle of high and low
                    
                
                if(middle*middle>x){
                    high=middle;//runs if middle squared is bigger than x, sets the new middle as the top of the interval
                    
                }
                else if(middle*middle<x){
                    low=middle;//runs if middle squared is smaller than x, sets the new middle as the bottom of the interval
                   
                }
                else{
                    break;//ends it if middle squared=x, which is what we want
                }
                
                
                
            }
            middle=(high+low)/2;//resets middle
            int middle1= (int)(100*middle);
            double middle2= middle1;//this is to eliminate any extra decimal points past two
             System.out.printf("The approximate square root of "+x+" is "+ (middle2)/100);
             System.out.println(" ");//just to add another line
        }
        else {
            System.out.println("You did not enter a correct number.");//in case they input a negative number or 0
        }
        }
        else{
            System.out.println("not a valid input");//incase they do not input a number
        }
        
       
             
         }//end of main method
}//end of class