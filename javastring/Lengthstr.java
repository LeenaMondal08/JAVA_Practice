import java.util.*;
class Lengthstr{
    public static void main(String args[]){
        String firstName="leena";
        String lastName="Mondal";
        String fullName=firstName+lastName;
        System.out.println(fullName);
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String title=sc.nextLine();
        System.out.println(name+" "+title);
        System.out.println(fullName.length());
    }
}