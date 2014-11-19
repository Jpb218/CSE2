//CSE002
//Justin Brock-Smith
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = "
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static double [] addArrays(double [] x, double [] y){
      int c=0;
       if(x.length>y.length){
            c=x.length;
        }
        else{
        c=y.length;
        }
      double [] v=new double[c];
      double d, t;
      for(int i=0; i<y.length||i<x.length; i++){
         if(y.length<=i){
             d=0;
         }
         else{
             d=y[i];
         }
         if(x.length<=i){
             t=0;
         }
         else{
             t=x[i];
         }
         
          v[i]=d+t;
      }
      return v;
  }
  public static boolean equals(double [] x, double [] y){
      boolean c=false;
      if(x.length==y.length){
      for(int j=0; j<x.length&&j<y.length; j++){
         
          if(x[j]==y[j]){
              c=true;
          }
          else{
              c=false;
              break;
          }
      }
      }
      return c;
  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}
