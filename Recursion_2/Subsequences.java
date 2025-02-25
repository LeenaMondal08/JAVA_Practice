class Subsequences{
    public static void substring(String str,int indx,String newString){
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }  
    char currChar=str.charAt(indx);
    // if the current char want to be add to the newString
    substring(str,indx+1,newString+currChar);
    // if the current char do not want to be add to the newString
    substring(str,indx+1,newString);
    }
    public static void main(String args[]){
        String str="abc";
        substring(str,0,"");
    }
}