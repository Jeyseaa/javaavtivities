package ProgrammingChallenge;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter your third number: ");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");

        } else {
            int number = number1;
            if (number2 > number) {
                number = number2;
            }
            if (number3 > number) {
                number = number3;
            }
            System.out.println("The larger number is: " + number);
        }
    }
}
