import java.util.*;
class Userinput{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int marks[]=new int[size];
    //input value
    for(int i=0;i<size;i++){
        marks[i]=sc.nextInt();
    }
    //fot output
    for(int i=0;i<size;i++){
       System.out.print(marks[i]);
    }
    
    }
}