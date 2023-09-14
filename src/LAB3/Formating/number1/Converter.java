package LAB3.Formating.number1;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        RubToYuanConverter p = new RubToYuanConverter(0.0759);
        p.convert();
    }
}
