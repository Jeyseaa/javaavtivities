package ProgrammingChallenge;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        System.out.println("Please enter any word: ");
        String word = qwerty.nextLine();

        StringBuilder discord = new StringBuilder(word).reverse();
        String result = word.contentEquals(discord) ? "a Palindrome" : "not a Palindrome";
        System.out.println("Your input word is " + result);
    }
}
