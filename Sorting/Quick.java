class Quick{
    public static int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
        while(arr[i]<=pivot && i<=high-1){
            i++;
        }
        while(arr[j]>pivot && j>=low+1){
            j--;
        }
        if(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
    int temp=arr[low];
    arr[low]=arr[j];
    arr[j]=temp;
    return j;
}
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pindx=partition(arr,low,high);
            quickSort(arr,low,pindx-1);
            quickSort(arr,pindx+1,high);
        }
    }
    public static void main(String args[]){
        int arr[]={6,8,1,3,9,5};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}