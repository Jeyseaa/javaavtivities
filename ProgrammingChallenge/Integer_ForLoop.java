package ProgrammingChallenge;
import java.util.Scanner;

public class Integer_ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        ROW:        for(int row = 1; row <=number; row++) {
            COL:            for (int col = 1; col <= number; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }


}
