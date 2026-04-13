class Number{
    public static int rev(int n1){
        int rev=0;
        while(n1!=0){
            rev=(rev*10)+n1%10;
            n1=n1/10;
        }
        return rev;
    }
          
    public static void main(String[] args){
        int n1=120;
        int n2=456;
        n1=rev(n1);
        int res=0;
        while(n1!=0 && n2!=0){
        int r1=n1%10;
        int r2=n2%10;
        res=(res*10)+r1;
        res=(res*10)+r2;
        n1=n1/10;
        n2=n2/10;
        }
        while(n1!=0){
        int r1=n1%10;
        res=(res*10)+r1;
        n1=n1/10;

        }
        while(n2!=0){
        int r2=n2%10;
        res=(res*10)+r2;
        n2=n2/10;

        }
        System.out.println(res);

        
}
}