import java.util.*;
class WordCount{
    public static int countWord(String str){
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println(countWord(str));
    }
}