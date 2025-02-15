import java.util.*;
class Grade{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int input;
        do{
            System.out.println("enter number:");
            int num=sc.nextInt();
            if(num>=90){
                System.out.println("this is good");
            }
            else if(num>=60 && num<90){
                System.out.println("this is also good");
            }
            else{
                System.out.println("this is good as well");
            }
            System.out.println("do you want to continue? yes(1)/no(0)");
            input=sc.nextInt();
        }
        while(input==1);
    }
}