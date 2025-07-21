class Student{
    int roll;
    String name;
    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    void display(){
        System.out.println(roll+" "+name);
    }
}
class Constructor{
    public static void main(String args[]){
        Student obj=new Student(1,"priya");
        Student obj2=new Student(3,"manami");
        obj.display();
        obj2.display();
    }

}