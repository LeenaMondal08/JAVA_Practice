import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;

class Practice_ArrayList1{
    public static void main(String args[]){
    ArrayList<Integer> list1 =new ArrayList<Integer>();
    int i=0;
    while(i<=5){
        list1.add(i);
        i++;
    }
    System.out.println("Before sorting the list");
    for(int j=0;j<list1.size();j++){
        System.out.print(list1.get(j)+" ");
    }
    System.out.println("after siorting the list");
    Collections.sort(list1);
    System.out.print(list1);
}
}