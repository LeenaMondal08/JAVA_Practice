class Reversestr{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("leena mondal");
        System.out.println(sb);
        for(int i=0;i<sb.length()/2;i++){
            int font=i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(font);
            char backChar=sb.charAt(back);
            sb.setCharAt(font,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.print(sb);
    }
}