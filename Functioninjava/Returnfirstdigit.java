class Returnfirstdigit{
    public static int firstDigit(int n) {
        while(n>=10){
            n=n/10;
        }
        return n;
        
    }
    public static void main(String args[]){
        System.out.print(firstDigit(1243));
    }
}