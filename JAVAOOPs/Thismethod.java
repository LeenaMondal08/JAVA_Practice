class Thismethod{
    void n(){
        System.out.println("hey leena");
    }
    void m(){
        this.n();
    }
    void p(){
        m();//this.m()
    }
    public static void main(String args[]){
        Thismethod obj= new Thismethod();
        obj.m();
        obj.p();
    }
}