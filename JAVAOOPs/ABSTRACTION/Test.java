abstract class Shape{
    abstract void draw();
    static void eat(){
        System.out.println("eating");
    }
}
class Rect extends Shape{
    void draw(){
        System.out.println("drawa rect");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("drawa Suare");
    }
}
class Test{
    public static void main(String args[]){
        Shape s=new Rect();
        s.draw();
        Shape s1=new Square();
        s1.draw();
        Square.eat();
    }
}
