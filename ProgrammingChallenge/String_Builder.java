package ProgrammingChallenge;
import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter or string: ");
        String inputString = scanner.nextLine();

        StringBuilder strBuild = new StringBuilder(inputString);

        System.out.println("The capacity of the StringBuilder for your input is: " + strBuild.capacity());
        System.out.println("The number of characters in the input is: " + strBuild.length());
    }
}
