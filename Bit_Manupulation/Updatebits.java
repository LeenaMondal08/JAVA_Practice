import java.util.*;
class Updatebits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();//1 or 0;
        int num=5;
        int pos=1;
        int bitMask=1<<pos;
        if(oper==1){
            //set operation
            int newNumber=(bitMask|num);
            System.out.println(newNumber);
        }
        else{
            //clear opeartion
            int newBitMask=~bitMask;
            int newNumber=(newBitMask|num);
            System.out.println(newNumber);
        }
    }
}