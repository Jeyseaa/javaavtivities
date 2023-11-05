package ProgrammingChallenge;
import java.util.Scanner;

public class Integer_ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        for (int row = 1; row <= number; row++) {
            // Print spaces before the asterisks
            for (int space = 1; space <= number - row; space++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



