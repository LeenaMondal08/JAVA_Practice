import java.util.*;
class Compare{
    public static void main(String args[]){
        String Name1="leena";
        String Name2="leena";
        System.out.println(Name1.compareTo(Name2));
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.compareTo(str2)==0){
            System.out.print("strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}