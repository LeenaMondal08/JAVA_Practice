class TestThrow1{
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("person not eligible");
        }
        else{
            System.out.println("person eligible");
        }
    }
    public static void main(String args[]){
        validate(16);
    }
}