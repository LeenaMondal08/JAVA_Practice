interface Printable{
abstract void print();
}
class Rect implements Printable{
    public void print(){
        System.out.println("print a rect");
    }
}
class Interface1{
    public static void main(String args[]){
        Printable p=new Rect();
        p.print();
    }
}