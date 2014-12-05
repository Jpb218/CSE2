

public class Yoyo{
    public static void main(String [] args){
  int []x=new int[4];
  double [] u=new double[5];
  double [] v=new double[3];
  x[0]=1;
  x[1]=2;
  x[2]=4;
  x[3]=6;
  for(int i=0; i<u.length;i++){
      u[i]=3+i;
  }
  v[0]=2;
  v[1]=4;
  v[2]=5;
  
  
  System.out.println(enigma(u,v,x));
  for(int j=0; j<x.length;j++){
      System.out.print(x[j]+" ");
  }
  System.out.println();
  for(int k=0; k<u.length;k++){
      System.out.print(u[k]+" ");
  }
  System.out.println();
  for(int q=0; q<v.length;q++){
      System.out.print(v[q]+" ");
  }
    }
    public static int enigma(double []x, double []y, int []z){
        double []temp;
        temp=x;
        temp[z[2]]=42.0;
        y=x;
        y[0]=2.34;
        return z[z[0]];
    }
}