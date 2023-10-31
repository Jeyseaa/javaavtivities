package ProgrammingChallenge;
import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = qwerty.nextLine();

        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

    }

    private static int countWords(String input) {
        String[] words = input.split(" ");
        return words.length;

    }

}