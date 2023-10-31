package ProgrammingChallenge;
import java.util.Scanner;

public class Grade_Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score here: ");

        int Score = scanner.nextInt();

        if (Score >= 90) {
            System.out.println("Grade: A");
        } else if (Score >= 80 && Score < 90) {
            System.out.println("Grade: B");
        } else if (Score >= 70 && Score < 80) {
            System.out.println("Grade: C");
        } else if (Score >= 69 && Score < 70) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade F");
        }
    }
}