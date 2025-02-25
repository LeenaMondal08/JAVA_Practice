class Removeduplicate{
    public static boolean[] map=new boolean[26];
    public static void rmvDupli(String str,int indx,String newString){
        if(indx==str.length()){
            System.out.print(newString);
            return;
        }
        char currChar=str.charAt(indx);
        if(map[currChar-'a']==true){
            rmvDupli( str, indx+1,newString);
        }
        else{
            newString+=currChar;
            map[currChar-'a']=true;
            rmvDupli( str, indx+1,newString) ; 
        }
        }
        public static void main(String args[]){
            String str="abbcddeeenag";
            rmvDupli(str, 0,"") ;  
        }
        }
