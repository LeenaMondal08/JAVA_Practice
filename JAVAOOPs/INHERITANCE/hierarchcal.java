import java.util.*;
class A{
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
}
class B extends A{
    int sum=x+y;
}
class C extends A{
    int sub=x-y;
}
class hierarchcal{
    public static void main(String args[]){
        C obj=new C();
        B obj1=new B();
        System.out.println(obj.sub);
        System.out.println(obj1.sum);

    }
}
