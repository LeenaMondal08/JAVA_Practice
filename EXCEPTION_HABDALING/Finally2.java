
// exception occur by not handle by catch
class Finally2{
    public static void main(String args[]){
        try{
            System.out.println("try block");
            int d=22/0; // arithmetic exception occure 
            System.out.println(d);
        }
        catch(NullPointerException e){ // only accept the null pointer exception
            System.out.println(e);
        }
        finally{
            System.out.println("Finall block");
        }
        System.out.println("rest of the code");
    }
}