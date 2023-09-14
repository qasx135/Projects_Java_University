package LAB3.Formating.number3;

import java.text.Format;
import java.util.Formatter;

public class Report {
    static void info(Employee[] mas) {
        for (Employee em : mas) {
            Formatter formatter = new Formatter();
            Double sl = em.salary;
            formatter.format("Salary: |%20.3f|", sl);
            System.out.println(formatter);
        }
    }
}
