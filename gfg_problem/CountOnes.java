public class CountOnes {
    public static int countOnes(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return i;
            }
        }
        return arr.length;
    }
    public static void main(String args[]){
        int[] arr={1,1,1,1,0,0};
        System.out.println(countOnes(arr));

    }
}
