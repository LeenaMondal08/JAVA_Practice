class Sortedarr{
    public static boolean isSort(int[] arr,int indx){
        if(indx==arr.length-1){
            return true;
        }
        if(arr[indx+1]<=arr[indx]){
            return false;
        }
        return isSort(arr,indx+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,8,8};
        System.out.print(isSort(arr,0));
    }
}
