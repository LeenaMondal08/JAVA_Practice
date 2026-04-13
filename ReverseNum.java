public class ReverseNum {
    public static int reverse (int number,int res){
        if(number==0){
            return res;
        }

        res=res*10 + number%10;
        return reverse(number/10,res);
    }
    public static void main(String[] args) {
        int number=123;
        int res=0;
        System.out.println(reverse(123,res));
    }
}
