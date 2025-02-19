class Fctorialofn{
    public static int calculateFact(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact=n*calculateFact(n-1);
        return fact;
    }
    public static void main(String args[]){
        int ans=calculateFact(5);
        System.out.print(ans);
    }
}