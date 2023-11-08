package ProgrammingChallenge;
import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter or string: ");
        String inputString = scanner.nextLine();

        if (inputString.isEmpty() || inputString.length() < 10) {
            System.out.println("The Given input is empty or too short " + "(Please Try Again)");

        } else {
            char inputstr = inputString.charAt(0);
            int InputString = inputString.length() - 1;
            int first = 2;
            int last = 6;
            String substringOfinputString = inputString.substring(first, last);

            StringBuilder strBuild = new StringBuilder(inputString);

            System.out.println("The Number of Characters in the input is: " + strBuild.length());
            System.out.println("This is First Character of your Input: " + inputstr);
            System.out.println("This is Last Character of your Input: " + inputString.charAt(InputString));
            System.out.println("This is Sub String of your Input: " + substringOfinputString);
            System.out.println("The index of the first occurrence of 'a' in the input string is: " + strBuild.indexOf("a"));
            strBuild.append("123");
            strBuild.insert(4, "xyz");
            strBuild.delete(2, 5);
            strBuild.deleteCharAt(8);
            strBuild.reverse();

            System.out.println("The String after appending '123': " + strBuild.toString());
            System.out.println("The String After inserting 'xyz' at index 4: " + strBuild.toString());
            System.out.println("The String After deleting the substring from index 2 to 4: " + strBuild.toString());
            System.out.println("The String After deleting the character at index 8: " + strBuild.toString());
            System.out.println("After reversing the string: " + strBuild.toString());


        }
    }
}
