class Matrixsum
{
    public static void  Addition(int[][] matrixA, int[][] matrixB)
    {
        int row=matrixA.length;
        int col=matrixA[0].length;
        int[][] sum=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j]= matrixA[i][j] + matrixB[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        
        return;
    }
    public static void main(String args[]){
        int matrixA[][]={{1,2},{3,8}};
        int matrixB[][]={{3,2},{3,9}};
        Addition(matrixA,matrixB);
    }
}