public class TypeCasting {
    public static void main(String args[]){
        //widening 
        int a=10;
        double b=a;
        System.out.println(a);
        System.out.println(b);

        //narrowing 
        int c=(int)1.569;
        System.out.println(c);
        byte f=10;
        byte g=20;
        byte res=(byte)(f+g);
        System.out.println(res);

        //for charecter
        int l='a';
        System.out.println(l);
        char t=65;
        System.out.println(t);
        double m='a';
        System.out.println(m);
        System.out.println((char)90);
        System.out.println((double)'A');
        System.out.println((int)b);


    }
}
