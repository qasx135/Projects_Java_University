package LAB11.number1;

import java.util.Date;

public class Number1 {
    public static void main(String[] args) {
        int year = 2023;
        int month = 10;
        int day = 22;
        int hour = 17;
        int minute = 13;
        System.out.printf("Second name: Kazachenko, Year: %s, Month: %s, Day: %s, " +
                "Hour %s, Minute: %s\n", year, month, day, hour, minute);
        Date date = new Date();
        System.out.println(" date: " + date);
    }
}
