class Pangramstr {
    public static String pangramCheak(String s){
        s=s.toLowerCase();
        int count=0;
        boolean[] letter=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                int index=ch-'a';
                if(!letter[index]){
                    letter[index]=true;
                    count++;
                }
            }

        }
        if(count==26){
            return "pangram";
        }
        return "not pangram";
    }
       public static void main(String args[]){
        String s="Thequickbrownfoxjumpsoverthelazydog";
        System.out.println(pangramCheak(s));
        System.out.print(pangramCheak("Leena Mondal"));
       } 


    }
