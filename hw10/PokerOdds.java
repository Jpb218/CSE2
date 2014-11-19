import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }//main method
  public static void simulateOdds(){
   
    int [] numbTimes =new int[13];
    for(int c: numbTimes){
        numbTimes[c]=0;
    }//sets the number of times each has a double to 0 to start
     int a, y, swapInt,d, doubNumb=0;
     
    for(int p=0; p<10000;p++){//runs this 10000 times
    int [] cardNumb= new int[5];//card hand array
    
     for(int q=0; q<cardNumb.length; q++){
        cardNumb[q]=-1;//sets them all to -1
    }
    int [] deckCards= new int [52];
    for(int l=0; l<deckCards.length; l++){//deck hand array, sets them all to their number
        deckCards[l]=l;
    }
      for(int i=0; i<cardNumb.length; i++){
        swapInt=cardNumb[i];//swapInt is to swap the value taken into the hand with the last value of the deck
        a=(int)(Math.random()*(51-i));
        cardNumb[i]=deckCards[a];
        deckCards[a]=swapInt;
        y=deckCards[51-i];//-i to keep it going down as the deck decreases
        deckCards[51-i]=deckCards[a];
        deckCards[a]=y;
      }
   
      d=0;
      for(int k=0; k<cardNumb.length; k++){//essentially copied from FindDuplicates, checks to see if there is only one double in the hand
        for(int j=0; j<cardNumb.length; j++){
            if(j!=k){//makes sure you are not just saying the same cards are equal
                if((int)(cardNumb[k]%13)==(int)(cardNumb[j]%13)){//mod 13 because they are out of 52
                    d+=1;
                    
                    doubNumb=(int)(cardNumb[k]%13);
                    
                }
            }
        }
      }
      
      if(d==2){//if d==2 we know that there was exactly one match (for k and j equaling both)
        numbTimes[doubNumb]+=1;
        
      }
      
  }
  System.out.println("A: "+ numbTimes[0]);
  for(int h=1; h<10; h++){
      System.out.println(h+": "+numbTimes[h]);
  }
 System.out.println("J: "+ numbTimes[10]);
 System.out.println("Q: "+ numbTimes[11]);
 System.out.println("K: "+ numbTimes[12]);//this code simply prints the final results out for us
  
    }
      
  

  
  public static void showHands(){
    boolean c;
    do{
        c=false;
     String clubs="Clubs: ", spades="Spades: ", hearts="Hearts: ", diamonds="Diamonds: ", placeHolder="";
    int [] cardNumb= new int[5];// sets hand
    int a, y, swapInt;
    for(int q=0; q<cardNumb.length; q++){
        cardNumb[q]=-1;// sets each part of hand =-1
    }
    int [] deckCards= new int [52];
    for(int j=0; j<deckCards.length; j++){
        deckCards[j]=j;//sets deck equal to their numbers
    }
      for(int i=0; i<cardNumb.length; i++){//repeat of above code, picks a random card from the deck and switches it
        swapInt=cardNumb[i];
        a=(int)(Math.random()*(51-i));
        cardNumb[i]=deckCards[a];
        deckCards[a]=swapInt;
        y=deckCards[51-i];
        deckCards[51-i]=deckCards[a];
        deckCards[a]=y;
      }
     for(int f=0; f<cardNumb.length; f++){
         switch (cardNumb[f]%13){// sets the placeholder as the number (or letter) that represents the card for printing
             case 0: placeHolder="A ";
             break;
             case 12: placeHolder="K ";
             break;
             case 11: placeHolder="Q ";
             break;
             case 10: placeHolder="J ";
             break;
             default: placeHolder= ((cardNumb[f]%13)+" ");
             
         }
         if((int)(cardNumb[f]/13)==0){//0 is clubs
            clubs+=placeHolder;
         }
         else if((int)(cardNumb[f]/13)==1){//1 is diamonds
         diamonds+=placeHolder;
             
         }
        else if((int)(cardNumb[f]/13)==2){//2 is hearts
        hearts+=placeHolder;
            
        }
        else if((int)(cardNumb[f]/13)==3){//3 is spades, no other options
        spades+=placeHolder;
            
        }
         }
         System.out.println(clubs);
         System.out.println(diamonds);
         System.out.println(hearts);
         System.out.println(spades);
         System.out.print("Go again? (Y,y) anything else to quit: ");
         
         Scanner scan=new Scanner(System.in);
         
         if(scan.next().equals("Y")||scan.next().equals("y")){
             c=true;
         }//asks the user if they want to continue
  }while(c==true);
    
  }
}
