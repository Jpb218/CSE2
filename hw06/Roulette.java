//Justin Brock-Smith
//CSE002
//10/10/14
//hw06 Roulette.java
//the purpose of this program is to run a simulation of betting one dollar in roulette one thousand times and see how much one would make on average

 //define the class
public class Roulette{
    //add a main method
    public static void main(String[] args) {
        int i, j, k=0, moneyWon=0, won=0, profitable=0, lost=0;//initializes variables early so as not have scoping issues
        for(i=0; i<1000; i++){//for statement set to run 1000 times
            won=0;//resets won ammount to 0
            for(j=0; j<100; j++){//this begins the actual betting of 100 dollars 
                
                k=(int) ((Math.random()*100000)%38);//generates a random int between -1 and 38
                    if(k==0){
                        moneyWon+=36;//1/38 chance to win 36 dollars
                        won+=1;//adds 1 to win count for this 100
                    }
                    else
                    {}
                    
            }
            if(won>2){
            profitable+=1;//if you win 3 or more, you are profitable
                
            }
            else if(won==0){
            lost+=1;//this is if you didn't win anything, adds 1 to total completely lost 100 dollars
            }
            else{
            }
        }
        System.out.println("You lost everything "+lost+" times.");
        System.out.println("You were profitable "+ profitable+" times.");
        System.out.println("You won $"+moneyWon+" and made a profit of $"+(moneyWon-100000));
        
    }
            
    }
        
        
        
        
        
        
        
        
    