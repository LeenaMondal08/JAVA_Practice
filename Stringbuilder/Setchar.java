class Setchar{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("leena");
        System.out.println(sb);
        sb.setCharAt(0,'p');
        System.out.println(sb);
        sb.insert(3,'s');
        System.out.print(sb);



    }
}