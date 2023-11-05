package ProgrammingChallenge;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
int number= scanner.nextInt();
if(number == 0){
    System.out.println("The number " +number + " is zero.");
} else if(number > 0){
    System.out.println("The number " +number +  " is positive.");
}else {
    System.out.println("The number" +number + " is negative.");
}
if (number %2 == 0){
            System.out.println("The number " +number +  " is even");

        }else{
            System.out.println("The number " +number + "is odd");
        }
}


}
