class DecimalToBinary {
    public static String toBinary(int n) {
        // Code here
        String str="";
        while(n>0){
            int r=n%2;
            str+=Integer.toString(r);
            n=n/2;
        }
        //reverse str
        StringBuilder res =new StringBuilder(str);
        return res.reverse().toString();
        
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(toBinary(n));
    }
}
