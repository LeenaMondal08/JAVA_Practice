interface Printable{
    abstract void print();
}
interface Showable{
    abstract void print();
}
class Comp implements Printable,Showable{
    public void print(){
        System.out.println("printing");
    }
}
class Interface3{
    public static void main(String args[]){
        Comp c=new Comp();
        c.print();
    }
}