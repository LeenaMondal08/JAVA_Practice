class Decrement {
    public static void main(String args[]){
    int a=10;
    int b=25;
    System.out.println(--b);
    System.out.println(a--);
    int p=10;
    int q=(p++)+(--p)+(++p)+(p--);
    int r=(p--)+(++q)+(--q)+(q--);
    int s=(--p)+(q--)+(r--)+(++r)+(--r)+(r++);
    System.out.println(p);
    System.out.println(q);
    System.out.println(r);
    System.out.println(s);
}
 }

