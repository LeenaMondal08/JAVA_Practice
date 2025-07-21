//exception does not occure but the finally block executed
class Finally1{
    public static void main(String args[]){
        try{
            System.out.println("try block");
            int d=22/11;
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