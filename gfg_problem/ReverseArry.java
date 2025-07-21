class ReverseArry{
    public static int[] printReverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }
    public static void main(String args[]){
        int[] arr={3,2,8,1};
        int[] newArry=printReverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(newArry[i]+" ");

        }


    }
}