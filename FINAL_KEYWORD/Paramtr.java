class Paramtr{
    int cube(final int x){
        x=x+1; // final parameter can not be changed;
    }
    public static void main(String args[]){
        Paramtr p=new Paramtr();
        p.cube(4);

    }
}