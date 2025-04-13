class Animal{
    void move(){
        System.out.println("animal can move");
    }
}
class Dog extends Animal{
    void move(){
        System.out.println("dog can walk and run");
    }
}
class Override{
    public static void main(String args[]){
        Animal a=new Animal();
        a.move();
        Dog b=new Dog();
        b.move();
    }
}