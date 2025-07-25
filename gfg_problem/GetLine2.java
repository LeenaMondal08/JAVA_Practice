import java.util.*;
class GetLine2{
public static void getLine() {
    String a;

    Scanner sc=new Scanner(System.in);
    String str =sc.nextLine();
    int index=str.indexOf('@');
    
    if(index!=-1){
        a=str.substring(0,index);
    }
    else{
        a=str;
    }
    

    System.out.println(a);
}
public static void main(String args[]){
  getLine();  
}
}
