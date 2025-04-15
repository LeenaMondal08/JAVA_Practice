class Nested{
    public static void main(String args[]){
        try{
            
            try{
                System.out.println("division by 0");
                int data=19/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[]=new int[5];
                a[5]=12;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}