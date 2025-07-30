// Given an array a[ ] of size N. The task is to check if array is sorted or not. A sorted array can either be increasingly sorted or decreasingly sorted. Also consider duplicate elements to be sorted.

// Example 1:

// Input:
// N = 5
// a[] = {1, 1, 2, 2, 3}
// Output: 
// 1
// Explanation: 
// Here, Given array a is increasingly sorted.
// Example 2:

// Input:
// N = 2
// a[] = {4, 2}
// Output: 
// 1
// Explanation:
// Here, Given array a is decreasingly sorted.
// Your Task:
// You don't need to read input or print anything. You just need to complete the function isSorted() that takes arr and n as parameters and returns 0 if arr is unsorted and returns 1 if arr is sorted.

class isSorted{
    public static int isSortedArry(int arr[], int n) {
        
        boolean increaseSort=true;
        boolean decreaseSort=true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                increaseSort=false;
            }
            if(arr[i]>arr[i-1]){
                decreaseSort=false;
            }
        }
        if(decreaseSort||increaseSort){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        int[] arr={1,2,5,12,8,9};
        int cheak=isSortedArry(arr,arr.length);
        if(cheak==1){
            System.out.print("sorted");
        }
        else{
            System.out.print("not sorted");
        }
    }
}