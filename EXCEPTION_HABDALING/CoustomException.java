class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        super(str);
    }
}
class CoustomException{
     static void validate(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("not eligible");
        }
        else{
            System.out.println("eligible for vote");
        }
    }
    public static void main(String args[]){
        try{
            validate(16);
        }
        catch(InvalidAgeException ex){
            System.out.println(ex);
        }
        System.out.println("rest of the code");
    }
}