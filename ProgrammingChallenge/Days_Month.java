package ProgrammingChallenge;
import java.util.Scanner;

public class Days_Month {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a number of month:");
        int month = Input.nextInt();

        int days;

        switch (month) {
            case 1:
                System.out.println("January");
                days=31;
                break;
            case 3:
                System.out.println("March");
                days=31;
                break;
            case 5:
                System.out.println("May");
                days=31;
                break;
            case 7:
                System.out.println("July");
                days=31;
                break;
            case 8:
                System.out.println("August");
                days=31;
                break;
            case 10:
                System.out.println("October");
                days=31;
                break;
            case 12:
                System.out.println("December");
                days=31;
                break;

            case 4:
                System.out.println("April");
                days=30;
                break;
            case 6:
                System.out.println("June");
                days=30;
                break;
            case 9:
                System.out.println("September");
                days=30;
                break;
            case 11:
                System.out.println("November");
                days=30;
                break;

            case 2:
                System.out.println("February");
                days = 28;
               break;

            default:

                System.out.println("Invalid Month Number");
                return;

        }

        System.out.println("Day number in selected month is " + days);

    }
}
