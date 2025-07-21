
// static blank final variable
class Test{
    static final int age;
    static{
        age=90; // only declare awithin the static block
    }
    public static void main(String args[]){
        System.out.println(Test.age);
    }
}