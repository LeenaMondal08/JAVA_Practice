import java.util.Scanner;

class ReverFunc {
    public static StringBuilder Reverse(StringBuilder str){
        for(int i=0;i<str.length()/2;i++){
            char fontchar=str.charAt(i);
            char backchar=str.charAt(str.length()-1-i);
            str.setCharAt(i,backchar);
            str.setCharAt(str.length()-1-i,fontchar);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        
        System.out.println(Reverse(sb));
        System.out.println(sb.length());
    }
    
}
