import java.util.*;
class Sumofn{
    public static void main(String args[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print(sum);

    }
}