package Operator;
class Increment {
    public static void main(String args[]){
        int a=20;
        int b=(a++)+(a++)+(a++);
        int c=(a++)+(b++)+(b++);
        int d=(c++)+(c++)-(a++)-(b++);
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}
