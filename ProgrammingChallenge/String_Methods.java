package ProgrammingChallenge;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String FirstName = scanner.nextLine();
char Firstname = FirstName.charAt(0);
int firstname = FirstName.length() - 1;
int first= 3;
int last= 6;
        String substringOfFirstName = FirstName.substring(first, last);



        System.out.print("Enter your Middle Name: ");
        String MiddleName = scanner.nextLine();

        char MiddleIni = MiddleName.charAt(0);
MiddleIni= Character.toUpperCase(MiddleIni);

        System.out.print("Enter your Last Name: ");
        String LastName = scanner.nextLine();

        System.out.println("The String of your Full Name is: " + FirstName +" " + MiddleIni + " " + LastName);

        int fullNameLength = FirstName.replaceAll("[^a-zA-Z]", "").length() +
                LastName.replaceAll("[^a-zA-Z]", "").length() + 1;



        System.out.println("This is String length of your Fullname: " + fullNameLength);
        System.out.println("This is String UpperCase of your Fullname: " +  FirstName.toUpperCase() +" " + MiddleIni + " " + LastName.toUpperCase());
        System.out.println("This is First Character of your First Name: "  + Firstname);
        System.out.println("This is Last Character of your First Name: "  + FirstName.charAt(firstname));
        System.out.println("This is Sub String of your First Name: " + substringOfFirstName);

    }
}
