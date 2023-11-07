package ProgrammingChallenge;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String FirstName = scanner.nextLine();

        System.out.print("Enter your Middle Name: ");
        char MiddleName = scanner.nextLine().charAt(0);

        System.out.print("Enter your Last Name: ");
        String LastName = scanner.nextLine();




        System.out.println("Your Full Name is: " + FirstName +" " + MiddleName + " " + LastName);
    }
}
