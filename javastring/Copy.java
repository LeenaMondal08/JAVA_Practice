import java.util.*;
class Copy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String newstr="";
        for(int i=0;i<name.length();i++){
            newstr+=name.charAt(i);
        }
        System.out.println(newstr);
}
}