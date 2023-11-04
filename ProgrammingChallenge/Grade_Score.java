package ProgrammingChallenge;
import java.util.Scanner;

public class Grade_Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score here: ");

        int Score = scanner.nextInt();

        if (Score >= 90) {
            System.out.println("Grade: A");
        } else if (Score >= 80 && Score <= 89) {
            System.out.println("Grade: B");
        } else if (Score >= 70 && Score <= 79) {
            System.out.println("Grade: C");
        } else if (Score >= 60 && Score <= 69) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade F");
        }
    }
}
