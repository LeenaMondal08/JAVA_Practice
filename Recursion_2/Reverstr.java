class Reverstr{
    public static void reverStr(String str, int indx){
        if(indx<0){
            return;
        }
        System.out.print(str.charAt(indx));
        reverStr(str,indx-1);
    }
    public static void main(String args[]){
        String str="abcd";
        reverStr(str,str.length()-1);
    }

    }
