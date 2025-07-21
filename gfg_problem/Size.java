class Size {
    private int[] a;

    // Constructor to initialize the array
    public Size(int[] arr){
        this.a = arr; 
        
    }
    // Method to get the size of the array
    public int getSize() {
        // Your code here
        
        return a.length;
    }
    public static void main(String args[]){
        //int[] ar={7,9,6,4};
        Size ob = new Size(new int[]{7, 9, 6, 4});
        System.out.print(ob.getSize());

    }
}