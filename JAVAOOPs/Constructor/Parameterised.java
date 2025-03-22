class Sum{
int res;
    Sum(int x,int y){
         res=x+y;
    }
    void print(){
        System.out.println("sum="+res);
    }
}
class Parameterised{
    public static void main(String args[]){
        Sum obj=new Sum(4,6);
        obj.print();
    }
}