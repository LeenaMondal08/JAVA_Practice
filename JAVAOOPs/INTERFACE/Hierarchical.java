class Circle{
    double pi=3.141;
    int r=2;
}
class Area extends Circle{
    double area=pi*r*r;
}
class Surface extends Circle{
    double s=4*pi*r;
}
class Hierarchical{
    public static void main(String args[]){
    Area a=new Area();
    Surface sur=new Surface();
    System.out.println("area of a circle is "+a.area);
    System.out.println("surface of a circle is "+sur.s);

    }
}
