class Counter2{
    static int count=0; // static variable can get the menory only one time and retains its value;
    Counter2(){
        count++;
        System.out.println(count);
    }
    public static void main(String args[]){
        Counter2 c1=new Counter2();
        Counter2 c2=new Counter2();
        Counter2 c3=new Counter2();


    }
}