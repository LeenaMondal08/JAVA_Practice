class Thisvari{
    int roll;
    String name;
    Thisvari(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    void print(){
        System.out.println(roll+""+name);
    }
    public static void main(String args[]){
        Thisvari v=new Thisvari(1,"leena");
        v.print();
    }
}