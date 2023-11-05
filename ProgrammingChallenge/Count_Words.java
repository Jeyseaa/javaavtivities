package ProgrammingChallenge;
import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);

        System.out.print("Enter any word or a sentence: ");
        String input = qwerty.nextLine();

        int wordCount = countWordsWithoutNumbers(input);
        System.out.println("Number of words (excluding numbers) in your input: " + wordCount);
    }

    private static int countWordsWithoutNumbers(String input) {
        String[] words = input.split(" ");
        int count = 0;

        for (String word : words) {
            if (!word.matches(".*\\d.*")) { // Check if the word contains any digit
                count++;
            }
        }

        return count;
    }
}
