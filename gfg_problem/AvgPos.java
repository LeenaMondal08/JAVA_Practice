class AvgPos{
    public static int posAverage(int numbers[], int size) {
        int sum=0,count=0;
        for(int i=0;i<size;i++){
            if(numbers[i]>=0){
                sum=sum+numbers[i];
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        return sum/count;
    }
    public static void main(String args[]){
        int[] arr={-3,1,0,-1,-5,1};
        int res= posAverage(arr,arr.length);
        System.out.print(res);
    }
}