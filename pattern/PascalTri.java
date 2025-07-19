public class PascalTri {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }

            int num = 1; // First number is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                // Compute next number in row using nCr formula
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

