package ProgrammingChallenge;
import java.util.Scanner;
public class Days_Week {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number from 1-7:" );

        int Day = Input.nextInt();
        if(Day>=1  && Day<=7){
String[] daysWeek={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
String D = daysWeek[Day - 1];
            System.out.println("The number " + Day + " is " + D + ".");

        }else{
            System.out.println("Invalid Input. Please enter a number between 1 and 7 only");

        }

    }
}
