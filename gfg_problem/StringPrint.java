class StringPrint {
    public static void alphabets(char c1, char c2) {
        // code here
        int strat=(int)c1;
        int end=(int)c2;
        for(int i=strat;i<=end;i++){
            System.out.print((char)i+" ");
        }
    }
    public static void main(String args[]){
        char c1='a';
        char c2='v';
        alphabets(c1,c2);

    }
}