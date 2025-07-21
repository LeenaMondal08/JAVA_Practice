// exception occure then handle by catch block
import java.io.*;
class M{
    void method() throws IOException{
        throw new IOException("device error");
    }
    public static void main(String args[]){
        try{
        M m=new M();
        m.method();
        }
        catch(Exception e){
            System.out.println("handle ception by ctach");
        }
        System.out.println("normla flow");

    }
}