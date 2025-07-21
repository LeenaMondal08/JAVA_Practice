class TestPropagation{
    void m(){
        int data=10/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String  args[]){
        TestPropagation po=new TestPropagation();
        po.p();
        System.out.println("rest of the code");
    }
}