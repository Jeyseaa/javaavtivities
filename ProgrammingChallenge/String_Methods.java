package ProgrammingChallenge;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter a String or Letters: ");
        String FirstName = scanner.nextLine();
         if (FirstName.isEmpty() || FirstName.length() < 6){
            System.out.println("The Given input is empty or too short " + "(Please Try Again)");

        } else {
            char Firstname = FirstName.charAt(0);
            int firstname = FirstName.length() - 1;
            int first = 1;
            int last = 6;
            String substringOfFirstName = FirstName.substring(first, last);

            System.out.println("The String of your Given Input: " + FirstName);

            int fullNameLength = FirstName.replaceAll("[^a-zA-Z]", "").length();


            System.out.println("This is String length of your Input: " + fullNameLength);
            System.out.println("This is String UpperCase of your Input: " + FirstName.toUpperCase());
            System.out.println("This is String UpperCase of your Input: " + FirstName.toLowerCase());
            System.out.println("This is First Character of your Input: " + Firstname);
            System.out.println("This is Last Character of your Input: " + FirstName.charAt(firstname));
            System.out.println("This is Sub String of your Input: " + substringOfFirstName);


        }
    }
}
