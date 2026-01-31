class Qspider{
    void print(){
        System.out.println("this is hadapsar campus");
}
}
class Javabatch extends Qspider{
    void print(){
        System.out.println("this is java batch");
    }
}
class AdvanceJava extends Javabatch{
    void print(){
        System.out.println("this is advance java batch");
    }
}
class sql extends Qspider{
    void print(){
        System.out.println("this is the sql batch");
    }
    }
class Main{
    public static void main(String args[]){
        Qspider q;
        q=new sql();
        q.print();
        q=new AdvanceJava();
        q.print();
        
    
    }
}  