import java.util.Scanner;

public class DayOfTheWeek {
    static String nameOfTheDay(int b) {
        String day = "Wrong number";
        switch (b) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
        }
        return day;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Pls input a number of the day from 1 to 7 : ");
        int b = a.nextInt();
        System.out.println(nameOfTheDay(b));
    }
}
