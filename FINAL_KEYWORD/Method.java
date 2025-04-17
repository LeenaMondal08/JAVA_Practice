class Bike{
    final void run(){ // final method 
        System.out.println("running");
    }
}
class Honda extends Bike{
    void run(){ // final method can not be overriden
        System.out.println("not running");
    }
}
class Method{
    public static void main(String args[]){
        Honda h=new Honda();
        h.run();
    }
}