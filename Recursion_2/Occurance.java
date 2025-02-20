class Occurance{
    public static int first=-1;
    public static int last=-1;
    public static void occur(String s,int indx,char ele){
        if(indx==s.length()){
            System.out.println("first "+first);
            System.out.println("last "+last);
            return;
        }
        char currele=s.charAt(indx);
        if(currele==ele){
            if(first==-1){
                first=indx;
            }
            else{
                last=indx;
            }
        }
        occur(s,indx+1,ele);
    }
    public static void main(String args[]){
        String s="abbagdyu";
        occur(s,0,'a');
    }
}