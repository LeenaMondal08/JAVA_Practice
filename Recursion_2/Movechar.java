class Movechar{
    public static String newString(String s,int indx,int count,char c,String newStr){
        if(indx==s.length()){
            for(int i=1;i<=count;i++){
                newStr+=c;
            }
            return newStr;
        }
        char currentChar=s.charAt(indx);
        if(currentChar==c){
            count++;
        }
        else{
            newStr+=currentChar;
        }
         return newString(s,indx+1,count,c,newStr);
    }
    public static void main(String args[]){
        String s="abxbxbhxxuy";
        System.out.print(newString(s,0,0,'x',""));
    }
}