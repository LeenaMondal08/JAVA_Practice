class Varitypes{
    static int n=12;// static variable
    int data=78;// instance variable
    public static void main(String args[]){
        int m=45;// local variable
        System.out.println(m);
        System.out.println(n);
        Varitypes d=new Varitypes(); 
        System.out.println(d.data);//instance veriable acessd by the boject

    }

}