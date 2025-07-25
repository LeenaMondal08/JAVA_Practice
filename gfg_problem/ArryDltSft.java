// You are given an array arr(0-based indexing). The size of the array is given by n. You need to delete an element at given index and modify given array. The arr[i] of array is initially set to i+1.
// Deletion means you need to shift all the elements after that index to the left by 1 position and set the last element as zero.

// Example 1:

// Input:
// n = 5
// index = 0
// Output: 
// 2 3 4 5 0
// Example 2:

// Input:
// n = 6
// index = 3
// Output: 
// 1 2 3 5 6 0
// // Your Task:
// // You don't need to read the input or print anything, as that is handled by the driver code. You only need to complete the function deleteFromArray() that takes arr, n, index as parameters and modifies the array arr as per requirements. 

// // Constraints:
// // 1 <= n<= 105
// // 0 <= index <= n-1




class ArryDltSft{
    public static void deleteFromArray(int arr[], int n, int index) {
        // Your code here
        int i;
        for(i=index+1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=0;
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int n=6;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        deleteFromArray(arr,n,3);
    }
}
        