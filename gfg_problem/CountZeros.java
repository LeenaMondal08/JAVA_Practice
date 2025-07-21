class CountZeros {
    public static int countZeroesFunc(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count=arr.length-i;
                break;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={1,1,1,1,1,0,0,0,0,0};
        System.out.println(countZeroesFunc(arr));

    }
}
