class Power{
    public static int calculatePowr(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int ans=x*calculatePowr(x,n-1);
        return ans;
    }
    public static void main(String args[]){
        int x=5;
        int n=3;
        int ans=calculatePowr(x,n);
        System.out.println(ans);
    }
}