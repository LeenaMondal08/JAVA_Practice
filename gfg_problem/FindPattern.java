class FindPattern{
    public static int patternIndex(String s,String p){
        int index=s.indexOf(p);
        return index;
    }
    public static void main(String args[]){
        String str="leena mondal";
        String subStr="on";
        int stratIdx=patternIndex(str,subStr);
        if(stratIdx==-1){
            System.out.println(subStr+" is not a substring of "+str);
        }  
        else{
            System.out.println("the possition of the substr is "+stratIdx);
        }  
    }
}