package LAB11.number2;

import java.util.Calendar;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        long system = System.currentTimeMillis();
        Calendar cal = Calendar.getInstance();
        Scanner in = new Scanner(System.in);

        System.out.print("Year: ");
        int y = in.nextInt();
        cal.set(Calendar.YEAR, y);
        System.out.print("Month: ");
        int m = in.nextInt();
        cal.set(Calendar.MONTH, m);
        System.out.print("Day: ");
        int d = in.nextInt();
        cal.set(Calendar.DAY_OF_MONTH, d);
        System.out.print("Hour: ");
        int h = in.nextInt();
        cal.set(Calendar.HOUR, h);
        System.out.print("Minute: ");
        int min = in.nextInt();
        cal.set(Calendar.MINUTE, min);
        System.out.print("Second: ");
        int s = in.nextInt();
        cal.set(Calendar.SECOND, s);

        if(system != cal.getTimeInMillis())
            System.out.println("Time is equal");
        else
            System.out.println("Time is not equal");
    }
}
