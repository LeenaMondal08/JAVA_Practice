class BinarySearch{
    public static int searchElement(int[] arr,int low,int high,int element){
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==element){
                return mid;
            }
            if(arr[mid]>element){
                high=mid-1;
            }
            if(arr[mid]<element){
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={ 2,5,6,17,23,67,89,91};
        int element=89;
        int indx=searchElement(arr,0,arr.length-1,element);
        System.out.println(indx);

    }
}