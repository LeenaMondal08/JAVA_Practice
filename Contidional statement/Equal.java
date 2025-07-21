import java.util.*;
class Equal{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.print("equal");
        }
        else if(num1>num2){
            System.out.print("num1 greater");
        }
        else{
            System.out.print("num2 greater");

        }
    }
}