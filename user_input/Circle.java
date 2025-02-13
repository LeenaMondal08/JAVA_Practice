import java.util.*;
class Circle{
    public static void main(String args[]){
        Double pi=3.141,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius:");
        Float r=sc.nextFloat();
        area=pi*r*r;
        System.out.println(area);
    }
}