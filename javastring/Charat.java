import java.util.*;
class Charat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String title=sc.nextLine();
        String fullName=name+" "+title;
        System.out.println(fullName);
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}