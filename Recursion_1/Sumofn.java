class Sumofn{
    public static void printSum(int i,int n,int sum){
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
        System.out.print(i);   
    }
    public static void main(String args[]){
        printSum(1,10,0);

    }
}