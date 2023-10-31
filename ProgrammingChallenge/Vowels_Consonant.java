package ProgrammingChallenge;

import java.util.Scanner;

public class Vowels_Consonant {
    public static void main(String[] args) {
        String fullName = "John Carl Balatan";

        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the full name to lowercase to make the comparison case-insensitive
        fullName = fullName.toUpperCase();

        for (int i = 0; i < fullName.length(); i++) {
            char c = fullName.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Fullname: " + fullName);
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }
}