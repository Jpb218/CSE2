//Justin Brock-Smith
//CSE002
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");//prompts user to enter 10 ints
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }//simply prints out the text in a formal way around the methods below

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }//this prints out the array for us in a neat fashion
  
  public static boolean hasDups(int [] a){//checks to see if there are any doubles
      
      for(int i=0; i<a.length; i++){
        for(int j=0; j<a.length; j++){
            if(j!=i){
                if(a[i]==a[j]){//if any values are equal this will return true and tell us that there is a double
                    return true;
                }
            }
        }
      }
      return false;
      
  }
  
  public static boolean exactlyOneDup(int [] a){//checks to see if there are only two matching variables
     int d=0;
      for(int i=0; i<a.length; i++){
        for(int j=0; j<a.length; j++){
            if(j!=i){
                if(a[i]==a[j]){
                    d+=1;
                }
            }
        }
      }
      if(d==2){//if d==2, the code will have run through with both i and j being each number, thus implying only one set of matching variables
          return true;
      }
      return false;//returns false if there are more or less matching variables
  }
}
