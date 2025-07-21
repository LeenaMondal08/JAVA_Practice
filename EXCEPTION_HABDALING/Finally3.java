
// finally block when exception occure and handle by catch
class Finally3{
    public static void main(String args[]){
        try{
            System.out.println("try block");
            int d=22/0;
            System.out.println(d);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finall block");
        }
        System.out.println("rest of the code");
    }
}