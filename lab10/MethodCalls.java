public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
 //original code
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
    public static int addDigit(int a, int b){
       int e, d=0;
       
        if(a<0){//checks to see if the number being added is negative, if it is, it makes it positive
            d=1;
            a*=(-1);
        }
        
        if((a)<100){//depending on the length of a, this adds the correct digit times the number that needs to be added
             e= a+100*b;
        }
        else if(a>=100&&a<1000){
            e= a+1000*b;
        }
        else if(a>=1000&&a<10000){
            e= a+10000*b;
        }
        else if(a>=10000&&a<100000){
            
            e= a+100000*b;
        }
        else if(a>=100000&&a<1000000){//deals with each length
            e= a+1000000*b;
        }
        else{//if not it just equals the number added
            e= b;
        }
        if(d==1){//if it was negative, we convert it back
            e*=(-1);
        }
        
        return e;//return the final number
    }
public static int join(int a, int b){
   int g=0, f=0;
    if(a<0){//checks to make sure the numbers being added are positive, if not it converts until the end
        a*=(-1);
        g=1;
    }
    
    if(b<0){//same as the first few lines of this method
        b*=(-1);
        f=1;
    }
    int d=0, e=0;
    
    int c=addDigit(b, a%10);//add digits with only the first digit of the number added
    
    if(a>=10){//if it has more than one digit, it adds the tens digit
        
        d=addDigit(c, (((a%100)-(a%10))/10));
        
    }
   

    if(a>=100){//if it has more than two, it adds the hundreds digit
        e=addDigit(d, (((a%1000)-(a%100))/100));
    }
  
  if(g==1||f==1){//if made negative it converts back to positive
    e*=-1;
    d*=-1;
    c*=-1;
  }
 
  if(e!=0){//if it got to e, it returns e
      return e;
  }
  else if(d!=0){//if it got to d, returns d
      return d;
  }
  else{//if it never activated the d if statement, returns only c
      return c;
  }
}


}