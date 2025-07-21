class Blank{
    final int x; // blank final variable
    Blank(){
        x=67; //blank final variable can be initilaized only within the constracture
        System.out.println(x);
    }
    public static void main(String args[]){
        new Blank();

    }
}