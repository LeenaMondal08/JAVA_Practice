class Name{
    public static void main(String[] args){
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if(i==5 || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for(int j=1;j<=r;j++){
                if(j==1||i==1||i==r||i==(r+1)/2){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");
            for(int j=1;j<=r;j++){
                if(j==1||i==1||i==r||i==(r+1)/2){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for(int j=1;j<=r;j++){
                if(j==1||j==r||i==j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(j==1||j==(2*i-1)||i==(1+r)/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }  
             System.out.println();
        }
        System.out.println();
     //title

        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
        if(j==1 || j==r || ((j==i || i+j==(r+1) ) && i<=(1+r)/2) ){
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
            System.out.print("   ");

            for(int j=1;j<=r;j++){
                if((i==1 || i==r) && (j>1 && j<r) || ((j==1 || j==r) && (i>1 && i<r) )){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for(int j=1;j<=r;j++){
                if(j==1||j==r||i==j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for(int j=1;j<=r;j++){
                if(((i==1 || i==r) && j<r )|| j==1 ||(j==r && i>1 && i<r)){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(j==1||j==(2*i-1)||i==(1+r)/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("  ");
        for(int j=1;j<=r;j++){
            if(i<=j){
                System.out.print(" ");
            }

        }
        for(int j=1;j<=r;j++){
                if(i==r || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

                System.out.println();
    }
        
        }
    }