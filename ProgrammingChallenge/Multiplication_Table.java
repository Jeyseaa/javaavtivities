package ProgrammingChallenge;
import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String[] args) {
        ROW:        for(int m = 1;m<=10;m++) {
            COL:            for (int n = 1; n <= 10; n++) {
                System.out.print(n*m+" ");
            }
            System.out.println();
        }
    }


}

