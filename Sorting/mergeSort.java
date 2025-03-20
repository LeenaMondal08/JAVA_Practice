class mergeSort{
    public static void conqure(int arr[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int x=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
            merged[x]=arr[i];
            x++;
            i++;
            }
            else{
                merged[x]=arr[j];
                x++;
                j++;
            }

        }
        while(i<=mid){
            merged[x]=arr[i];
                x++;
                i++;
        }
        while(j<=ei){
            merged[x]=arr[j];
                x++;
                j++;
        }
        for(int ind1=0;ind1<merged.length;ind1++){
            arr[ind1]=merged[ind1-si];
        }
    }
    public static void devide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei+si)/2;
        devide(arr,si,mid);
        devide(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
    }

    public static void main(String args[]){
        int[] arr={4,8,1,9,3,12,5,10};
        int n=arr.length;
        devide(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
