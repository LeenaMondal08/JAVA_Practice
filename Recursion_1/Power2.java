// calculate power x^n where the stack size (logn)

class Power2{
    public static int calculatePowr(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
         return calculatePowr(x,n/2)* calculatePowr(x,n/2);
        }
        else{
            return calculatePowr(x,n/2) * calculatePowr(x,n/2)*x;

        }
    }
    public static void main(String args[]){
        int x=5;
        int n=2;
        int ans=calculatePowr(x,n);
        System.out.println(ans);
    }
}