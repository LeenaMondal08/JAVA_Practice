class Fibonacci{
    public static void calculateFibo(int a,int b,int n){
        if(n>0){
            int c=a+b;
            System.out.print(c+" ");
            calculateFibo(b,c,n-1); 
        }
        return;
    }
    public static void main(String args[]){
        int a=0;
        int b=1;
        int n=10;
        System.out.print(a+" "+b+" ");
        calculateFibo(a,b,n-2);
    }
}