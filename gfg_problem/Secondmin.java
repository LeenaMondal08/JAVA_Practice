class Secondmin {
    public static int secondMin(int[] arr){
        int min=arr[0];
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                temp=min;
                min=arr[i];
            }
            else {
                if(arr[i]!=min && temp>arr[i]){
                    temp=arr[i];
                }
            }
        }
        return temp;
    }
    public static void main(String args[]){
        int[] arr= {7,8,7,10,7,4,5,2};
        System.out.println(secondMin(arr));
    }
}
