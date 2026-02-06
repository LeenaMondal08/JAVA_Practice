interface A{
    default void display(){
        System.out.println("interface a");
    }
    int x=6;
}
interface B{
    default void display(){
        System.out.println("interface b");

    }
    int x=9;
}
class C implements A,B{
    @Override
    public void display(){
        System.out.println("display");
                A.super.display();
                B.super.display();

    }
    }
class Dimond{
    public static void main(String args[]){
        C obj=new C();
        obj.display();
        //System.out.println(obj.x);
        System.out.println(A.x);
    }
}