package ProgrammingChallenge;

public class Multiplication_Table {
    public static void main(String[] args) {
        for (int m = 1; m <= 10; m++) {
            // Print leading spaces to create a pyramid shape
            for (int space = 1; space <= 10 - m; space++) {
                System.out.print("   ");
            }

            for (int n = 1; n <= m; n++) {
                int product = n * m;
                // Print the product with leading spaces to align them
                System.out.printf("%3d    ", product);
            }
            System.out.println();
        }
    }
}
