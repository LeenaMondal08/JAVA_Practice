class Overload{
    int cal(int x,int y){
        return x+y;
    }
    int cal(int x,int y,int z){
        return x*y*z;
    }
    void cal(double x,String y){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]){
        Overload ob=new Overload();
        System.out.println(ob.cal(2,8));
        ob.cal(4.5,"leena");
        System.out.println(ob.cal(6,9,0));
    }
}