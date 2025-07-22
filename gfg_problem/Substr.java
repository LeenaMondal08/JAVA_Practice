class Substr{
    public static String substring(String S, int L, int R) {

    
        return S.substring(L,R+1);
    }
    public static void main(String args[]){
        String newStr = substring("leena mondal",3,8);
        System.out.println(newStr);
    }
}