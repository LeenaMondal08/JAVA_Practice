
import java.util.*;
class HappyNumber {
    public static String ckeckHappy(int num){
        while(num!=1 && num!=4){
            int sum=0;
            while(num!=0){
                int r=num%10;
                sum=sum+(r*r);
                num=num/10;
            }
            num=sum;
        }
        if(num==1){
            return "happy";
        }
        return "sad";

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(ckeckHappy(num));
    }
}
