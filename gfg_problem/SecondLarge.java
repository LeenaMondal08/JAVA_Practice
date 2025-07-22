class SecondLarge{
public static int returnSecond(int[] arr){
    int max=arr[0];
    int temp=arr[0];
    for(int i=1;i<arr.length;i++){
        if(max<arr[i]){
            temp=max;
            max=arr[i];
        }else if(arr[i]>temp && arr[i]!=max){
            temp=arr[i];
        }
    }
    return temp;
}

    public static void main(String arg[]){
        int[] arr= {7,7,7,4};
        System.out.println(returnSecond(arr));

    }
}