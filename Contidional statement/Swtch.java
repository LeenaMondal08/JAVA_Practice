import java.util.*;
class Swtch{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int button=sc.nextInt();
        switch(button){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            default:
            System.out.println("invalid");
        }
    }
}
        