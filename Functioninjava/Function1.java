import java.util.*;
class Function1{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        printMyName(name);//calling function
    }
}