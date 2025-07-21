class A{
    void eat(){
        System.out.println("eating");
    }
}
class B extends A{
    void code(){
        System.out.println("coding");
    }
}
class C extends B{
    void sleep(){
        System.out.println("sleeping");
    }
}
class Multilevel{
    public static void main(String args[]){
        C obj=new C();
        obj.eat();
        obj.code();
        obj.sleep();
    }
}
