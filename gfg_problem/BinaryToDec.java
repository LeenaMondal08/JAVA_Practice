class BinaryToDec {
    public static int binaryToDecimal(String b) {
        // Code here
        long size=b.length();
        long num =Long.parseLong(b);
        long sum=0;
        for(long i=0;i<size;i++){
            long r=num%10;
            sum=(long)(sum+(r*Math.pow(2,i)));
            num=num/10;
        }
        return (int)sum;
    }
    public static void main(String args[]){
        int num=111;
        //String str=Integer.toString(num);
        System.out.println(binaryToDecimal(Integer.toString(num)));
    }
}