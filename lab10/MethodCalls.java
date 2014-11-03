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
       
        if(a<0){
            d=1;
            a*=(-1);
        }
        else{}
        if((a)<100){
             e= a+100*b;
        }
        else if(a>=100&&a<1000){
            e= a+1000*b;
        }
        else if(a>=1000&&a<10000){
            e= a+10000*b;
        }
        else if(a>=10000&&a<100000){
            e= a+100000;
        }
        else if(a>=100000&&a<1000000){
            e= a+1000000;
        }
        else{
            e= b;
        }
        if(d==1){
            e*=(-1);
        }
        else{}
        return e;
    }
public static int join(int a, int b){
   int g=0, f=0;
    if(a<0){
        a*=(-1);
        g=1;
    }
    else{}
    if(b<0){
        b*=(-1);
        f=1;
    }
    else{}
    int d=0, e=0;
    System.out.println(a+" "+b);
    int c=addDigit(b, a%10);
    System.out.println(c);
    if(a>=100){
        
        d=addDigit(c, ((a%100-a%10)));
        System.out.println(d);
    }
    else{
        
    }
    if(a>=1000){
        e=addDigit(d, ((a%1000-a%100-a%10)));
    }
    else{
        
    }
  if(g==1||f==1){
    e*=-1;
    d*=-1;
    c*=-1;
  }
  else{}
  if(e!=0){
      return e;
  }
  else if(d!=0){
      return d;
  }
  else{
      return c;
  }
}


}