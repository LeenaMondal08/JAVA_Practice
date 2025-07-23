// Given an unsorted array arr[] of size N containing non-negative integers. You will also be given an integer X, the task is to count the number of elements which are strictly smaller than X. The given integer may or not be present in the array given.

// Example 1:

// Input:
// N = 5
// arr[] = {4 5 3 1 2}
// X = 3
// Output: 2
// Explanation: Here X = 3, and elements that
// are smaller than X are 1 and 2.
// Example 2:

// Input:
// N = 6
// arr[] = {2 2 2 2 2 2}
// X = 3
// Output: 6
// Explanation: Here X = 3, and elements that
// are smaller than X are 2 2 2 2 2 2.
// Your Task:
// Since this is a functional problem you don't have to worry about the input, you just have to complete the given function smallerThanX() which takes 3 arguments(array arr, N, and X) and returns the count of elements smaller than X. The printing is done by the driver code.

class CountSmaller {
    public static int smallerThanX(int arr[], int n, int x) {
        // Your code here
        int count=0;
        for(int i=0;i<n;i++){
            if(x>arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[] arr= {2,6,8,3,9,1,3};
        System.out.println(smallerThanX(arr,arr.length,5));
    }
}