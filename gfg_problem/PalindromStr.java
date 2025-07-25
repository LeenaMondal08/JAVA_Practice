class PalindromStr {
    public static boolean isPalindrome(String s) {
        // code here
        if(s.length()==1){
            return true;
        }
        String tempStr=s;
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length()/2;i++){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(sb.length()-1-i));
            sb.setCharAt(sb.length()-1-i,temp);
        }
        if(sb.toString().compareTo(tempStr)==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.print(isPalindrome("aba"));
    }
}