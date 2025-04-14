class Encap{
    private String name;
    private int id;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setAll(String name,int id){
        this.name=name;
        this.id=id;
    }
}
class Main{
    public static void main(String args[]){
        Encap e=new Encap();
        e.setAll("leena",6);
        System.out.print(e.getName()+" "+e.getId());
    }
}