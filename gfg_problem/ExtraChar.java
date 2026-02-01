class ExtraChar {
    public static char extraChar(String s1, String s2) {

        // write your code here
        int sum1=0,sum2=0;
        for(int i=0;i<s1.length();i++){
            sum1=sum1+s1.charAt(i);
        }
        for(int i=0;i<s2.length();i++){
            sum2=sum2+s2.charAt(i);
        }
        int val=sum2-sum1;
        return (char) val;
    }
    public static void main(String[] args){
        String s1="abcd",s2="aycdb";
        System.out.println(extraChar(s1,s2));
    }
}
