import java.util.HashSet;
class Subsequ2{
    public static void substring(String str,int indx,String newString,HashSet<String> set){
        if(indx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
            System.out.println(newString);
            set.add(newString);
            return;
        }  
    }
    char currChar=str.charAt(indx);
    // if the current char want to be add to the newString
    substring(str,indx+1,newString+currChar,set);
    // if the current char do not want to be add to the newString
    substring(str,indx+1,newString,set);
    }
    public static void main(String args[]){
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        substring(str,0,"",set);
    }
}