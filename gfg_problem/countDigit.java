class countDigit {
    public static int countDigits(int n) {
        int count=1;
        while(n>=10){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int no=countDigits(245);
        System.out.println(no);
        
    }
}
