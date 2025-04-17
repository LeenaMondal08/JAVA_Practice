final class Bike{ // final class 
    void run(){ 
        System.out.println("running");
    }
}
class Honda extends Bike{ // honda extends the final class 
    void run(){ 
        System.out.println("not running");
    }
}
class Class{
    public static void main(String args[]){
        Honda h=new Honda();
        h.run();
    }
}