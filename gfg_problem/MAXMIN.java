class MAXMIN{
    public static void minmax(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min element  is:"+min);
        System.out.println("max element  is:"+max);
    }
    public static void main(String args[]){
        int[] arr={6,2,9,1};
        minmax(arr);

}
}