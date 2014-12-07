public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   public static void sort(int [][] mat3d){//this sort both sorts the rows of the array and each array inside the third array
       int smallest;
         int temp=0;
       for(int i=0; i<mat3d.length; i++){
           smallest = mat3d[i][0];
           int kindex=-1;
           for(int j=0; j<mat3d[i].length; j++){//selection sort to make each array in order
               for(int k=j; k<mat3d[i].length; k++){
                   
                   if(mat3d[i][k]<smallest){
                       smallest=mat3d[i][k];
                       kindex = k;
                   }
                       
                      }
                     if(kindex!=-1){
                         
                      temp=mat3d[i][j];
                       mat3d[i][j]=smallest;
                       mat3d[i][kindex]=temp;
                       smallest=100;
                     }
               }
             
             
           }
           int [] temp2=new int[20];//this switches the arrays if the first number of one is smaller using insertion sort
           for(int q=1; q<mat3d.length; q++){
               if(mat3d[q][0]<mat3d[q-1][0]){
                   temp2=mat3d[q];
                   mat3d[q]=mat3d[q-1];
                   mat3d[q-1]=temp2;
                   if(q>1){
                       q-=2;
                   }
               }
           }
       }
   
   public static int [][][] buildMat3d(){//this simply creates each array using the given parameters and random numbers between 0 and 100
       int [][][] mat3d=new int[3][][];
       for(int i=0; i<3; i++){
           mat3d[i]=new int[3+2*i][];
           for(int j=0; j<mat3d[i].length; j++){
               mat3d[i][j]=new int[i+j+1];
               for(int f=0; f<mat3d[i][j].length; f++){
                   mat3d[i][j][f]=((int)(Math.random()*100));
               }
           }
       }
       return mat3d;
   }
   public static void show(int [][][] mat3d){//this simply prints out the arrays
        for(int i=0; i<mat3d.length; i++){
           for(int j=0; j<mat3d[i].length; j++){
               for(int f=0; f<mat3d[i][j].length; f++){
                  System.out.print(mat3d[i][j][f]+" ");
               }
               System.out.println();
           }
           System.out.println("-------- Slab "+(i+1));
       }
   }
   public static int findMin(int [][][] mat3d){//this finds the min by searching each array and resetting the smallest every time a smaller int is found
       int minVal=mat3d[0][0][0];
       for(int i=0; i<mat3d.length; i++){
           for(int j=0; j<mat3d[i].length; j++){
               for(int f=0; f<mat3d[i][j].length; f++){
                       if(mat3d[i][j][f]<minVal){
                           minVal=mat3d[i][j][f];
                       }
                   }
               }
           }
           return minVal;
       }
}
