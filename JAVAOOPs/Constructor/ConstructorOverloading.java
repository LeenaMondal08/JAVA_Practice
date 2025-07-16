class ConstructorOverloading{
    String name;
    ConstructorOverloading(){
        this.name="Default";
    }
   ConstructorOverloading(String name){
        this.name=name;
    }
    void print(){
        System.out.println(this.name);
    }
    public static void main(String args[]){
        ConstructorOverloading ob=new ConstructorOverloading();
        ob.print();
        ConstructorOverloading ob2=new ConstructorOverloading("leena");
        ob2.print();
        
    }
}
