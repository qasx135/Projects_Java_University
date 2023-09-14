package LAB3.Formating.number2;

import LAB3.RandomAndMath.number3.Array;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ShoppingCart {
    ArrayList<String> list;
    Integer counter = 0;

    public ShoppingCart() {
        this.list = new ArrayList<>();
    }

    public void add(String name) {
        list.add(name);
    }

    public void plus(int amount) {
        this.counter = counter + amount;
    }

    public void showCart() {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void showTotal() {
        Locale lc = new Locale("ru");
        NumberFormat num1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat num2 = NumberFormat.getCurrencyInstance(Locale.KOREAN);
        NumberFormat num3 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat num4 = NumberFormat.getCurrencyInstance(lc);
        System.out.println("total: " + num1.format(counter * 0.009699) + "|" + num2.format(counter * 13.86) + "|" + num3.format(counter*0.0104) + "|" + num4.format(counter));
    }
}
