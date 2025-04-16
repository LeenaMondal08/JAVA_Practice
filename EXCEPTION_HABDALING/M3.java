import java.io.*;
class M3{
    void method()throws IOException{
        throw new IOException("error");
    }
    public static void main(String args[])throws IOException{
        M3 m3=new M3();
        m3.method();
        System.out.println("normal flow;");
    }
}