package ProgrammingChallenge;
import java.util.Scanner;

public class Average_Sum {
    public static void main(String[] args) {

        Scanner array = new Scanner(System.in);


        System.out.print("Enter the number of elements in your array: ");
        int n = array.nextInt();


        double[] numbers = new double[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = array.nextDouble();
        }


        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }


        double average = sum / n;


        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);


    }
}
