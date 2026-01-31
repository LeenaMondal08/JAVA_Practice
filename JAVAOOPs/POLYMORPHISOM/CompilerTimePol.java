class Qspider{
    void Java(int id,String batch){
        System.out.println("id="+id+" batch="+batch);
    }
    void Java(String batch,int id){
        System.out.println("id="+id+" batch="+batch);

    }
    void Java(int id, String batch, String time){
        System.out.println("id="+id+" batch="+batch+" time="+time);

    }
}
class CompilerTimePol {
    public static void main(String[] args){
    Qspider q=new Qspider();
        q.Java(1,"advance java","6.00pm");
        q.Java("sql",23);
    }
}
