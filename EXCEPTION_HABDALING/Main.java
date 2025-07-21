class Main{
    public static void main(String args[]){
        try{
            int data=10/0;  // raise the exception
        }
        catch(ArithmeticException e){ //handle the exception
            System.out.println(e);
        }
        System.out.println("rest of code");
    }
}