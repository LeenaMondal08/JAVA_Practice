// see what happen it exception is not handle by the catch
class Nothandle{
    public static void Main(String args[]){
        try{
            System.out.prinltn("try block");
            String str=null;
            int length=str.length();
        }
        System.out.println("rest of the code");
    }
}