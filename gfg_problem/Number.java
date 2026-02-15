class Number{
    public static int result(int n1,int n2){
        int sum1=0;
        int sum2=0;
        while(n1>0 && n2>0){
            int r1=n1%10;
            int r2=n2%10;
            sum1=(r1*10)+r2;
            sum2=(sum2*100)+sum1;

            n1=n1/10;
            n2=n2/10;
        }
        return sum2;
    }
    public static void main(String[] args){
        int n1=687;
        int n2=564;
        int sum=0;
        while(n1>0){
            int r=n1%10;
            sum=(sum*10)+r;
            n1=n1/10;
        }
        System.out.println(result(sum,n2));

    }
        
}