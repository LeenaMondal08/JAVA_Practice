import java.util.*;
class Fact{
    public static void calculateFactorial(int n){
        if(n<0){
            System.out.print("invalid number");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.print(factorial);
        return ;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calculateFactorial(n);
        
    }
}