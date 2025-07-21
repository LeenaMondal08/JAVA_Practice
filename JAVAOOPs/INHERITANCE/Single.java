class Salary{
    int sal=2000;
}
class Bonus extends Salary{
    int bonus=200;
}
class Single{
    public static void main(String args[]){
        Bonus obj=new Bonus();
        System.out.println(obj.sal);
        System.out.print(obj.bonus);
    }
}