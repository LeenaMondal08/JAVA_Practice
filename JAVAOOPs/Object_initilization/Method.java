class A{
    int id;
    String name;
    void insertValue(int i,String n){
        id=i;
        name=n;
    }
    void printValue(){
        System.out.println(id+" "+name);
    }
    }
    class Method{
        public static void main(String args[]){
            A obj=new A();
            obj.insertValue(1,"leena mondal");
            obj.printValue();
        }
    }
