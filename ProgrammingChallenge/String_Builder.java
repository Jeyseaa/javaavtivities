package ProgrammingChallenge;
import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter a Letter or String: ");
        String inputString = scanner.nextLine();

        if (inputString.isEmpty()) {
            System.out.println("The Given input is empty. (Please Try Again.) ");
        } else if (inputString.length() < 10) {
            System.out.println("The Given input is too short. (Please Input atleast 10 characters again.) ");
        } else if (!inputString.matches("^[a-zA-Z]*$")) {
            System.out.println("The Given input contains special characters. (Please Input Letters or String only.)");
        } else {
            char firstCharacter = inputString.charAt(0);
            int inputLength = inputString.length();
            int lastIndex = inputLength - 1;
            int start = 2;
            int end = 6;
            String substringOfInput = inputString.substring(start, Math.min(end, inputLength));

            StringBuilder strBuild = new StringBuilder(inputString);

            System.out.println("This is Number of Characters in the Given input: " + strBuild.length());
            System.out.println("This is First Character of your Given Input: " + inputString.charAt(0));
            System.out.println("This is Last Character of your Given Input: " + inputString.charAt(lastIndex));
            System.out.println("This is Index of the first occurrence of 'a': " + strBuild.indexOf("a"));
            System.out.println("This is Sub String of your Given Input: " + substringOfInput);

            strBuild.append("123");
            strBuild.insert(4, "xyz");
            strBuild.delete(2, 5);
            strBuild.deleteCharAt(8);
            strBuild.reverse();

            System.out.println("This is after reversing of Given Input: " + strBuild.toString());
        }
    }
}
