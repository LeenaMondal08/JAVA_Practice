class Animal{    
    Animal(){System.out.println("animal is created");}    
}    
class Dog extends Animal{    
    Dog(){    
        super();  //calls the constructor of parent class  
        System.out.println("dog is created");    
    }    
}    
public class Cons{    
    public static void main(String args[]){    
        Dog d=new Dog();    
    }  
}    