class Multiplecatch{
    public static void main(String args[]){
        try{
            int data=10/0;
            System.out.println(data);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}