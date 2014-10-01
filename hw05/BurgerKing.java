//Justin Brock-Smith  9/30/14   BurgerKing.java CSE 002
import java.util.Scanner;
public class BurgerKing{//main method
    public static void main(String[] args){
        Scanner buyerInput;
        buyerInput= new Scanner(System.in);//sets the new scanner equal to the next input
        System.out.print("Would you like a burger (B, b), fries (F, f) or a soda (S, s)? ");
        String order=(String) buyerInput.next();//sets string equal to next input
        switch(order){//first switch is the order
            case "B": case "b"://burger order
                System.out.println("What would you like on your burger? Ketchup (K, k), Cheese (C, c), both (B, b) or neither (N, n)");
                String burgerTopping =(String)buyerInput.next();//creates new string as input
                switch(burgerTopping){//second switch for toppings on order
                    case "K": case "k":
                        System.out.println("You got a burger with ketchup.");
                        break;
                    case "N": case "n":
                        System.out.println("You got a plain burger.");
                        break;
                    case "C": case "c":
                        System.out.println("You got a burger with cheese.");
                        break;
                        case "B": case "b":
                        System.out.println("You got a burger with ketchup and cheese.");
                        break;
                    default: System.out.println("not a valid order");
                    return;//this ends the program if they do not enter a valid char
                }
                break;
            case "f": case "F"://case two for fries
                  System.out.println("Large (L, l) or small (S, s) fries?");
                String fries =(String)buyerInput.next();//sets string equal to input
                switch(fries){
                      case "L": case "l":
                        System.out.println("You got large fries.");
                        break;
                         case "S": case "s":
                        System.out.println("You got small fries.");
                        break;
                     default: System.out.println("not a valid order");
                    return;//this ends the program if they do not enter S, s, L or l
                }
                break;
             case "S": case "s"://case three for soda
                  System.out.println("Coke (C, c), Pepsi (P, p), or Sprite (S, s)");
                String soda =(String)buyerInput.next();//sets next input equal to a string
                switch(soda){//the switch for the string of soda
                        case "S": case "s":
                        System.out.println("You got a Sprite.");
                        break;
                          case "P": case "":
                        System.out.println("You got a Pepsi.");
                        break;
                          case "C": case "c":
                        System.out.println("You got a Coke");
                        break;
                     default: System.out.println("not a valid order");
                    return;//ends program if they do not enter a char
                    
                }
                break;
            default:
            System.out.println("I am sory that is not a valid order.");
            return;//ends program if they do not enter a char originally
        }
        
        
        
    }
    
    
    
    
}