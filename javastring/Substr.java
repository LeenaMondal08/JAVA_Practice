import java.util.*;
class Substr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String sub=name.substring(2,name.length());
        System.out.println(sub);
        System.out.println(name.substring(1));
    }
}