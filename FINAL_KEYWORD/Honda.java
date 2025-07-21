// final method can be inherited
class Bike{
    final void run(){ // final method 
        System.out.println("running");
    }
}
class Honda extends Bike{
    public static void main(String args[]){
        new Honda().run(); // inherited 
    }
}