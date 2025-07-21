interface Printable{
    abstract void print();
}
interface Showable{
    abstract void show();
}
class Comp implements Printable,Showable{
    public void print(){
        System.out.println("printing");
    }
    public void show(){
        System.out.println("showing");
    }
}
class Interface2{
    public static void main(String args[]){
        Printable c=new Comp();
        c.print();
        c.show();
    }
}