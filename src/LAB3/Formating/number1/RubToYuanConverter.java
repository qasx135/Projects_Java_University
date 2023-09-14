package LAB3.Formating.number1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class RubToYuanConverter {
    private double percent = 0.0;
    private String from = "";
    private String to = "";
    private Locale locFrom;
    private Locale locTo;

    public RubToYuanConverter(double percent) {
        this.percent = percent;
        this.locFrom = new Locale("ru");
        this.locTo = new Locale("zh");
    }

    private double getPercent() {
        return percent;
    }

    private String getFrom() {
        return from;
    }

    private String getTo() {
        return to;
    }

    private void setFrom(String from) {
        this.from = from;
    }

    private void setTo(String to) {
        this.to = to;
    }
    public void convert() {
        System.out.println("Введите сумму для перевода(Из рублей ы юани): ");
        Scanner in = new Scanner(System.in);
        Double am = in.nextDouble();
        NumberFormat numFrom = NumberFormat.getCurrencyInstance(locFrom);
        NumberFormat numTo = NumberFormat.getCurrencyInstance(locTo);
        double to = percent * am;
        System.out.println(numFrom.format(am) + " -> " + numTo.format(to));
    }
}
