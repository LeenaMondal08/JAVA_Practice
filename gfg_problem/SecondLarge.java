class SecondLarge{
public static int returnSecond(int[] arr){
    int max=-1;
    int temp=-1;
    for(int i=0;i<arr.length;i++){
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