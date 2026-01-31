import java.util.*;
class Multiplication {
    public static int[][] Mul(int[][] arr1,int[][] arr2 ,int row1,int col1,int row2,int col2){
        if(col1==row2){
            int[][] res=new int[row1][col2];
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        res[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            return res;
        }
        return arr1;

    }
    public static void main(String args[]){
        int row1=3,col1=3;
        int row2=3,col2=2;
        Scanner sc=new Scanner(System.in);
        int[][] mtx1=new int[row1][col1];
        int[][] mtx2=new int[row2][col2];
        System.out.println("enter 1st matrix");
        for(int i=0;i<row1;i++){
            for (int j=0;j<col1;j++){
                mtx1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter 2nd matrix");
        for(int i=0;i<row2;i++){
            for (int j=0;j<col2;j++){
                mtx2[i][j]=sc.nextInt();
            }
        }
        int[][] res = Mul(mtx1,mtx2,row1,col1,row2,col2);
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
