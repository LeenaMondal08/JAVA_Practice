class Arryincr {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]-1;
        }
        return arr;
    }
    public static void main(String args[]){
        int[] arr={2,5,7,8,8};
        int[] newArr=decrementArrayElements(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(newArr[i]);
        }

    }
}