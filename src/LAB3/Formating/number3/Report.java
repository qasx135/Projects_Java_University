package LAB3.Formating.number3;

import java.util.Formatter;

public class Report {
    static void info(Employee[] mas) {
        for (Employee em : mas) {
            Formatter formatter = new Formatter();
            Double sl = em.salary;
            String name = em.fullname;
            formatter.format("Salary: |%20.2f| -> %s", sl, name);
            System.out.println(formatter);
        }
    }
}
