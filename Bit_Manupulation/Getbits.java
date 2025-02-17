class Getbits{
    public static void main(String args[]){
        int num=8;//1000
        int pos=2;
        int bitmask=1<<pos;
        if((bitmask & num) == 0){
            System.out.print("bit on the poss is 0:");
        }
        else{
            System.out.println("bit was one");

        }
    }
}