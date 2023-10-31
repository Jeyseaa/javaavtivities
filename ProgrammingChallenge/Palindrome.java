package ProgrammingChallenge;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {

        Scanner qwerty = new Scanner(System.in);
        String name = qwerty.nextLine();

        StringBuilder discord = new StringBuilder(name).reverse();

        System.out.println(name.contentEquals(discord));
    }
}

