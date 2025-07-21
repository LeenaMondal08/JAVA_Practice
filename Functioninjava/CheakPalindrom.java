class CheakPalindrom{
    public static String cheakPalindrom(int num){
        
        int sum=0;
        int rem;
        int temp =num;
        while(num>0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(temp==sum){
            return "palindrom";
        }
        else{
            return "not palindrom";
        }
    }
    public static void main(String[] args) {
        String str=cheakPalindrom(126);
        System.out.println(str);
}
}