package Task121;
import Task121.DateTask;
public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1,1,1978);
        DateTask date2 = new DateTask(9,21,1984);

        System.out.println("Date1: " + date1.toString());
        System.out.println("Date2: " + date2.toString());

        System.out.println("Leap years between 1980 and 2023:");
        DateTask.leapYears();
    }
}
