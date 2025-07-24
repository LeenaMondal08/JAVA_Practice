class ReverseNumberTriangle{
    public static void printReverseNumberTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        printReverseNumberTriangle(5);
    }
}