public class RaggedArrays{
    public static void main(String [] args){
        int [][] x=new int[5][];
        for(int i=0; i<5; i++){
            x[i]=new int[i*3+5];
            for(int j=0; j<x[i].length; j++){
                x[i][j]=((int) (Math.random()*40));
            }
        }
        for(int a=0; a<5; a++){
            for(int b=0; b<x[a].length; b++){
                System.out.print(x[a][b]+" ");
            }
            System.out.println();
        }
        int temp=0;
        System.out.println("sorted:");
        for(int h=0; h<5; h++){
            
            for(int g=0; g<x[h].length; g++){
               for(int y=0; y<x[h].length-1; y++){
                   if(x[h][y+1]<x[h][y]){
                       temp=x[h][y+1];
                       x[h][y+1]=x[h][y];
                       x[h][y]=temp;
                       if(y>2){
                          y-=2; 
                       }
                   }
               } 
            }
        }
         for(int w=0; w<5; w++){
            for(int k=0; k<x[w].length; k++){
                System.out.print(x[w][k]+" ");
            }
            System.out.println();
        }
    }
}