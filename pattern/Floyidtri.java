import java.util.*;
class Floyidtri{
    public static void main(String args[]){
        int number=1;
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}