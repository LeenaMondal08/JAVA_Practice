class Qspider{
    String hr ="kalavati mam";
}
class JavaBatch extends Qspider{
    String sir="nandish sir";
}
class SingleInheritence{
    public static void main(String args[]){
        JavaBatch j=new JavaBatch();
        System.out.println("for java:"+j.sir+" for hr: "+j.hr);
    }
}