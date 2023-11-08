package ProgrammingChallenge;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter a String or Letters: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("The Given input is empty. (Please Try Again.) ");
        } else if (input.length() < 5) {
            System.out.println("The Given input is too short. (Please Input atleast 5 characters again.) ");
        } else if (!input.matches("^[a-zA-Z]*$")) {
            System.out.println("The Given input contains special characters. (Please Input Letters or String only.");
        } else {
            char firstCharacter = input.charAt(0);
            int inputLength = input.length();
            int lastIndex = inputLength - 1;
            int start = 1;
            int end = 5;
            String substringOfInput = input.substring(start, Math.min(end, inputLength));

           
            System.out.println("This is String length of your Given Input: " + inputLength);
            System.out.println("This is String UpperCase of your Given Input: " + input.toUpperCase());
            System.out.println("This is String LowerCase of your Given Input: " + input.toLowerCase());
            System.out.println("This is First Character of your Given Input: " + firstCharacter);
            System.out.println("This is Last Character of your Given Input: " + input.charAt(lastIndex));
            System.out.println("This is Sub String of your Given Input: " + substringOfInput);
        }
    }
}
