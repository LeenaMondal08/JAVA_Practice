import java.util.*;
class Searchele{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mtx[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mtx[i][j]=sc.nextInt();
            }
    }
        int x=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              if(mtx[i][j]==x){
                System.out.print("index of x:"+i+","+j);
              }
            }
        }
    }
}