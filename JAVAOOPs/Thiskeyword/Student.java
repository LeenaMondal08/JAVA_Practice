class Student{

    Student(){
        this(5);
        System.out.println("this is constratur");
    }
    Student(String name){

        System.out.println(name);
    }
    Student(int x){
        this("leena");
        System.out.println("this is another value:"+x);
    }
    public static void main(String args[]){
        Student obj=new Student();
    }




}
