class Variable {    
    final int SPEED_LIMIT=90;    //final variable    
    void run() {    
     SPEED_LIMIT=400;   //we cannot change the final variable    
    }    
    public static void main(String args[]) {    
    Variable obj=new  Variable();    
    obj.run();    
    }    
   }  