import java.util.Scanner;
public class PokerHands {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);//scanner input
        String a, result="", add="";
        int b, d=0, temp=0, m=0, kl=10;
        boolean p=false, o=false;
        int [] value=new int[5];
        String [] suit=new String[4]; 
        //creates suit array to display cards
        suit[0] = "Clubs: ";
        suit[1] = "Spades: ";
        suit[2] = "Diamonds: ";
        suit[3] = "Hearts: ";
        for(int t=0; t<5; t++){//sets all values to 0
            value[t]=0;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the suit: 'c', 's', 'd', 'h'");
            a = myScan.next();
            if (a.equals("c") || a.equals("s") || a.equals("d") || a.equals("h")) {//gets the correctsuit from people
               do{
                System.out.println("Now enter the number of the card: A=1, K=13, Q=12, J=11 ");
                b = myScan.nextInt();
                if(b>0&&b<14){//if card is in correct range, creates correct value for it based on suit
                    if(b>1&&b<11){
                        add+=b;
                    }
                    else if(b==11){
                        add="J";
                    }
                    else if(b==12){
                        add="Q";
                    }
                    else if(b==13){
                        add="K";
                    }
                    else if(b==1){
                        add="A";
                    }
                if (a.equals("c")){//clubs goes from 1-13, spades from 14-26, etc. 
                    suit[0]+=(add+" ");
                    value[i]=(b);
                }
                else if (a.equals("s")) {
                    suit[1]+=(add+" ");
                    value[i]=(b+13);
                }
                else if (a.equals("d")) {
                    suit[2]+=(add+" ");
                    value[i]=(b+26);
                }
                else if (a.equals("h")) {
                    suit[3]+=(add+" ");
                    value[i]=(b+39);
                }
                add="";
                }
            
                else{
                    System.out.println("not a valid number");
                    p=true;
                }
                
               }while(p==true);

            }

            else {
                System.out.println("Not valid");
                i-=1;
            }
        }
        int xindex = -1;
        for(int q=0; q<4; q++){
            System.out.println(suit[q]);
            //this prints out the stored string array to show the input numbers
        }
          int [] cardVals=new int [5];//this converts the value array to cardVals, so it is easier to check number vals without suit
                     for(int dd=0; dd<cardVals.length; dd++){
                         if(value[dd]%13==0){
                             cardVals[dd]=13;
                         }
                         else{
                         cardVals[dd]=value[dd]%13;
                         }
                     }
         for(int s=0; s<5;s++){//this sorts the cardVals for us so it is easy to check 
             xindex = s;
                 for(int x=s; x<5;x++){
                    
                    if(cardVals[x] < cardVals[s]){
                        xindex = x;
                    }
                 }
                     if(xindex != -1){
                         int temp1 = cardVals[s];
                         cardVals[s] = cardVals[xindex];
                         cardVals[xindex] = temp1;
                     }
                     
                 }
         
             for(int qq=0; qq<value.length; qq++){
                System.out.print(cardVals[qq]+" ");
             }
         result+="High Card: "+(cardVals[4]);//this sets the basis to high card of whatever the highest card is
         int xindex=-1;
         for(int w=0; w<5; w++){//using two for loops this finds out whether or not there is a pair by seeing if their values are equal
             for(int l=0; l<5;l++){
             if(l==w){//does not continue if values are equal
                 continue;
             }
             if((cardVals[w])==(cardVals[l])){
                 if(m==cardVals[w]||m==cardVals[l]){//if they have been paired together before
                     continue;
                 }
                 if(d==0){
                     result="You have a pair of ";
                     result+=(cardVals[w])+"'s";
                     xindex=cardVals[w];
                     d+=1;
                 }
                 if(d==1&&xindex!=cardVals[l]){//adds a second pair if there is one
                     result+=("and a pair of "+cardVals[w]+"'s"; 
                 }
                 
                  m=(cardVals[w]);
                 
                 
             }
             }
         }
             for(int u=0; u<5;u++){//this now adds one for loop for three of kind
                 for(int l=0; l<5; l++){
                     for(int w=0; w<5; w++){
                 
             if(l==w||w==u||u==l){
                 continue;
             }
             if((cardVals[w])==(cardVals[l])&&(cardVals[w])==(cardVals[u])&&(cardVals[u])==(cardVals[l])){
              //if they are all equal, it rewrites best hand to three's
               result="You have three ";
               result+=(cardVals[w])+"'s";
               break;
               
               
             }
             }
            }
                 
             }
             
             
             d=1;
             if(cardVals[4] == 1+cardVals[3] && cardVals[3] == 1+cardVals[2] && cardVals[2] == 1+cardVals[1] && cardVals[1] ==1+ cardVals[0]||(cardVals[0]==1&&cardVals[1]==10) ){
            d=0;     
             }
             if(d==0){//if all the cards are in line (including ace to king), is a straight
              result="";
              result+="You have a straight from "+cardVals[0]+" to "+cardVals[4];
                 o=true;//for straight flush later
             }
             boolean flush=true;
             for(int aa=0; aa<5; aa++){
                 for(int f=0; f<5; f++){
                if(f==aa){
                    continue;
                }     
                 if(value[f]/13==value[aa]/13){
                     
                 }
                 else{
                     flush=false;
                 }
             }//if all the values have the same suit (/13), flush remains true
             if(flush==true){
                 result="";
                 result+="You have a flush!";
             }
             
             
             
             if(flush&&o){//if both straight and flush are true this is true
                 result="";
                 result+="You have a straight flush!";
                 kl=0;
             }
             
             
         }
         if(kl!=0){//this is four for loops to test if there is four of a kind
          for(int y=0; y<5; y++){
               for(int u=0; u<5;u++){
                 for(int l=0; l<5; l++){
                     for(int w=0; w<5; w++){
                 
             if(l==w||l==u||l==y||w==u||w==y||u==y){
                 continue;
             }
             if((cardVals[w])==(cardVals[l])&&(cardVals[w])==(cardVals[u])&&cardVals[y]==cardVals[w]){
              
               result="You have four ";
               result+=(cardVals[w])+"'s";
               break;
               
               
             }
             }
            }
               }
                 
             }
         }
        
         
         System.out.println(result);//prints the best hand

    }
}