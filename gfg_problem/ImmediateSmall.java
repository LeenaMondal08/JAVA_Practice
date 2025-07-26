class ImmediateSmall{
    public static int closeSmall(int[] arr, int n, int x){
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]<x && arr[i]>ans){
                ans=arr[i];

            }
        }
        return ans;

    }
    public static void main(String args[]){
        int[] arr={2,5,1,8,4,9};
        int res=closeSmall(arr,arr.length,1);
        System.out.println(res);
    }
}