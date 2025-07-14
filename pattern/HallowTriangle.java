import java.util.*;
class HallowTriangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row number:");
        int row =sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1 || k==i || i==row){
                System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

    }
}