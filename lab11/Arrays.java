//CSE002
//Justin Brock-Smith
//11/9/14

import java.util.Scanner;
public class Arrays{
    public static void main(String []args){
        int[] numberList;
        int d=0;
        numberList= new int[10];
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter ten integers.  First- ");
        while(d<numberList.length){
            if(scan.hasNextInt()){
                numberList[d]=scan.nextInt();
                d++;
            }
            else{
                System.out.println("This integer is not valid, try again:");
                scan.next();
            }
        }
        
        int lowestInt=numberList[0];
        int highestInt=numberList[0];
        int sumTotal=numberList[0];
        for(int i=1; i<numberList.length; i++){
            if(lowestInt>numberList[i]){
            lowestInt=numberList[i];
            }
            if(highestInt<numberList[i]){
            highestInt=numberList[i];
            }
            sumTotal+=numberList[i];
        }
       
    
        
        System.out.println("The lowest number is "+lowestInt);
        System.out.println("The highest number is "+highestInt);
        System.out.println("The sum is "+sumTotal);
        for(int j=0; j<numberList.length;j++){
            System.out.println(numberList[j]+"  "+numberList[9-j]);
        }
       
      
    
    
    }
}