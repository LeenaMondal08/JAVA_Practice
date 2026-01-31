abstract class Cricket{
     abstract int total_run();
     Cricket(){
         System.out.println("cobtratuter");
     }
     static int x=10;
     final int y =20;
      char c='T';
     void print(){
         System.out.println("this is the cricket abstract class");
     }
}
class ODI extends Cricket{
    int total_run(){
        return 100+x;
    }
}
class Abst{
    public static void main(String[] args){
        ODI ob=new ODI();
        System.out.println(ob.total_run());
        System.out.println(ob.c+" "+ob.y);
        ob.print();
        
        
    }
}

