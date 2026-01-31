class Thismethod{
    void m(){
        System.out.println("this method m");
    }
    void n(int x){
        System.out.println(x);
        m();
        p("leena");

    }
    void p(String name){
        System.out.println(name);
    }
    public static void main(String args[]){
        Thismethod obj=new Thismethod();
        obj.n(7);
    }
}
