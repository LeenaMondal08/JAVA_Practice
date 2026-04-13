class Perfect{
    public static void main(String[] args){
        int num=28;
        int sum=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
            sum+=i;
            }
        }
    if(num==sum){
        System.out.println("perfect");
    }
    else{
        System.out.println("non perfet");
    }

}
}