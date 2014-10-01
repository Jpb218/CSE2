//Justin Brock-Smith 9/30/14 hw05 CSE002
import java.util.Scanner;//imports Scanner
public class BoolaBoola{//main method
        public static void main(String[] args){//main class
            Scanner tOrF;//creates new Scanner
            tOrF=new Scanner(System.in);
            boolean a;
            boolean b;
            boolean c;
            boolean case1;//creates booleans for each true false and the input of the user
            int aInt=((int) (Math.random()*10)+1);
            int cInt=((int) (Math.random()*10)+1);
            int bInt=((int) (Math.random()*10)+1);//randomly generates numb from 1-10
            int andOrInt=((int) ((Math.random()*10)+1)%5);
            if (aInt>5){
            a=true;
            }
            else{
            a=false;    
            }//creates the boolean randomly
             if (bInt>5){
            b=true;
            }
            else{
            b=false;    
            }//second boolean
             if (cInt>5){
            c=true;
            }
            else{
            c=false;    
            }//third boolean
            switch(andOrInt){//creates a switch statement for all four cases of && or ||
                case 1:
            System.out.print("T or F?: "+a+"&&"+b+"&&"+c+" ");
            case1=(a&&b&&c);
            break;//for && &&
            
            case 2:
            System.out.print("T or F?: "+a+"&&"+b+"||"+c+" ");
            case1=(a&&b||c);
            break;//for && ||
            
            case 3:
            System.out.print("T or F?: "+a+"||"+b+"&&"+c+" ");
            case1=(a||b&&c);
                break;//for || && 
            
            case 4:
                
            System.out.print("T or F?: "+a+"||"+b+"||"+c+" ");
            case1=(a||b||c);
            break;//for || ||
            }
            String tOrFInt= (String)tOrF.next();
            switch(tOrFInt){//user input of their guess for true or false
            case "F": case "f"://this deals with their guess if it is false
                if (case1=false){
                    System.out.println("correct!!");
                }
                else{
                    System.out.println("That's incorrect.");
                    
                }
                break;
                 case "T": case "t":
                if (case1=true){//this deals with their guess if it is true
                    System.out.println("correct!!");
                }
                else{
                    System.out.println("That's incorrect.");
                    
                }
                break;
                default:
                System.out.println("Not a valid input.");
                break;
            }
            
        
            
        }
    
    
    
}