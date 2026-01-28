class Kolkata{
    String place="newtown";
    void print(){
        System.out.println("this is kolkata");

    }
}
class SaltLake extends Kolkata{
    String company="tcs";
    void print(){
        System.out.println("company name:"+company+"location: "+place);

    }
}
class Techno extends SaltLake{
    int stu_no=78;
    void print(){
        System.out.println("total selected student :"+stu_no+" company name: "+company+" location: "+place);
    }
}
class Multilevel{
    public static void main(String args[]){
        Techno tech=new Techno();
        tech.print();
        Kolkata s=new SaltLake();
        s.print();
        Kolkata k=new Kolkata();
        k.print();
        SaltLake s2=new Techno();
        s2.print();
        //SaltLake obj=new Kolkata();
        //obj.print();
    }
}
    
