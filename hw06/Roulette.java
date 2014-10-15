//Justin Brock-Smith
//CSE002
//10/10/14
//hw06 Roulette.java
//the purpose of this program is to run a simulation of betting one dollar in roulette one thousand times and see how much one would make on average

 //define the class
public class Roulette{
    //add a main method
    public static void main(String[] args) {
        int i, j, k=0, moneyWon=0, won=0, profitable=0, lost=0;
        for(i=0; i<1000; i++){
            won=0;
            for(j=0; j<100; j++){
                
                k=(int) ((Math.random()*100000)%38);
                    if(k==0){
                        moneyWon+=36;
                        won+=1;
                    }
                    else
                    {}
                    
            }
            if(won>2){
            profitable+=1;
                
            }
            else if(won==0){
            lost+=1;
            }
            else{
            }
        }
        System.out.println("You lost everything "+lost+" times.");
        System.out.println("You were profitable "+ profitable+" times.");
        System.out.println("You won $"+moneyWon+" and made a profit of $"+(moneyWon-100000));
        
    }
            
    }
        
        
        
        
        
        
        
        
    