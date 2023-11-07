package ProgrammingChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Vowels_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter only a string or letters: ");
        String inputString = scanner.nextLine().toLowerCase();

        if (inputString.isEmpty()) {
            System.out.println("The Input given is empty");
        } else if (!inputString.matches("^[a-zA-Z]*$")) {
            System.out.println("Please enter only a string or letters.");
        } else {
            ArrayList<Character> vowels = new ArrayList<>();
            ArrayList<Character> consonants = new ArrayList<>();

            for (int i = 0; i < inputString.length(); i++) {
                char c = inputString.charAt(i);
                if (isVowel(c)) {
                    vowels.add(c);
                } else if (isConsonant(c)) {
                    consonants.add(c);
                }
            }

            System.out.println("Vowels: " + vowels + " (" + vowels.size() + ")");
            System.out.println("Consonants: " + consonants + " (" + consonants.size() + ")");
        }
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static boolean isConsonant(char c) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }
}
