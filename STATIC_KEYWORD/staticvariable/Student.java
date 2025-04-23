class Student{
    int roll;
    String name;
    static String clg="bwu";
    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    void display(){
        System.out.println(roll+" "+name+" "+clg);
    }
    public static void main(String args[]){
        Student s1=new Student(45,"leena");
        Student s2=new Student(47,"teena");
        
        //Student.clg="brainware";  change the clg name for all instaces;

        s1.display();
        s2.display();

    }
}