import java.io.*;
class M2{
    void method()throws IOException{
        System.out.println("exception not occure");
    }
    public static void main(String args[])throws IOException{
        M2 m2=new M2();
        m2.method();
        System.out.println("normal flow;");
    }
}