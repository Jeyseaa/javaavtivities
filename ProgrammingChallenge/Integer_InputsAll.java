package ProgrammingChallenge;
import java.util.Scanner;

public class Integer_InputsAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter an integer (0 to stop): ");
        int number = input.nextInt();

        while (number != 0) {
            sum += number;
            System.out.print("Enter another integer (0 to stop): ");
            number = input.nextInt();
        }

        System.out.println("Sum of all integers entered are : " + sum);


    }
}