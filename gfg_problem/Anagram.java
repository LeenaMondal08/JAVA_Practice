class   Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        // b code here
        int[] str1=new int[26];
        int[] str2=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int index=ch-'a';
            str1[index]+=1;
            
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            int index=ch-'a';
            str2[index]+=1;
        }
        for(int i=0;i<26;i++){
            if(str1[i]!=str2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s1="leena";
        String s2="leneam";
        System.out.println(areAnagrams(s1,s2));
    }
}