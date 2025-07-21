class Setbits{
    public static void main(String args[]){
        int num=8;//1000
        int pos=2;
        int bitmask=1<<pos;
        int newNum=(bitmask|pos);
        System.out.println(newNum);
    }
}