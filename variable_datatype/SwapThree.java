public class SwapThree {
    public static void main(String[] args){
        int a=100,b=25,c=30;
        System.out.println("before swap:a="+a+" b="+b+" c="+c);
        //swap first two
        a=a+b;
        b=a-b;
        a=a-b;
        // swap last two
        b=b+c;
        c=b-c;
        b=b-c;
        System.out.println("after swap:a="+a+" b="+b+" c="+c);

    }
}
