import java.util.*;
class Matrix{
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
        System.out.println("print 2d arry:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }
    }
}