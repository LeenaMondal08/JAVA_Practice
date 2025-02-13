import java.util.*;
class Search{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int marks[]=new int[size];
    //input value
    for(int i=0;i<size;i++){
        marks[i]=sc.nextInt();
    }
    int x=sc.nextInt();
    //fot output
    for(int i=0;i<marks.length;i++){
       if(marks[i]==x){
        System.out.print("number x found at index:"+i);
       }
    }
    
    }
}