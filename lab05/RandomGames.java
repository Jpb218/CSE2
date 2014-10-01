//Justin Brock-Smith //9/26/14 //RandomGames lab05 //CSE002 
import java.util.Scanner;//imports a scanner 
//define the class 
public class RandomGames{
    //add main method
    public static void main(String[] args){
        
        Scanner randomScanInput= new Scanner(System.in);
        System.out.print("Would you like to play Roulette, Craps or pick a random card out of a deck of cards? (R,r, C,c, P,p): ");
            String inputLetter=randomScanInput.next();
            if((inputLetter.equals("C"))||(inputLetter.equals("c"))){
            int craps1=((int) ((Math.random()*10)+1)%7);
            int craps2=((int) ((Math.random()*10)+1)%7);
            System.out.println(craps1+" + "+craps2+" = "+(craps1+craps2));
                
            }
            
            else if((inputLetter.equals("P"))||(inputLetter.equals("p"))){
                 int deck=((int) ((System.currentTimeMillis()%13)+1));
                 String card="";
                 switch(deck){
                     case 11:
                         card+="Jack";
                         break;
                    case 12:
                        card+="Queen";
                        break;
                    case 13:
                        card+="King";
                        break;
                    case 1:
                        card+="Ace";
                        break;
                    default:
                        card+= ""+deck;
                        break;
                 }
                 int suitNumb =((int) (((Math.random()*10)%4)+1));
                 String suit="";
                    switch(suitNumb){
                        
                        case 1:
                            suit+="hearts";
                            break;
                        case 2:
                            suit+="spades";
                            break;
                        case 3:
                            suit+="diamonds";
                            break;
                        case 4:
                            suit+="clubs";
                            break;
                    }
                    System.out.println("Your card is the "+card+" of "+suit);
                 
            }
            else if((inputLetter.equals("R"))||(inputLetter.equals("r"))){
                int roulette=((int) (System.currentTimeMillis()%39));
                switch(roulette){
                    case 37:
                        System.out.println("Roulette: 00");
                        break;
                    case 38:
                        System.out.println("Roulette: 0");
                        break;
                    default:
                        System.out.println(roulette);
                        break;
                }
            }
            else{
            System.out.println("You did not enter one of the options.");
            return;//this ends the program if they did not enter one of the letter options
            }
        }
        
        
        
        
        
    }
    
