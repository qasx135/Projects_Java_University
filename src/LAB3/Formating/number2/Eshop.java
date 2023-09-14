package LAB3.Formating.number2;

import java.util.Scanner;

public class Eshop {
    ShoppingCart shoppingCart;

    public Eshop() {
        shoppingCart = new ShoppingCart();
    }
    public void work() {
        Scanner in = new Scanner(System.in);
        Integer choice = 0;
        while (choice != 5) {
            System.out.println("1) Шапка 100р");
            System.out.println("2) Тапки 1000р");
            System.out.println("3) Куртка 11500р");
            System.out.println("4) Штаны 500р");
            System.out.println("5) Выход");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    shoppingCart.add("Шапка");
                    shoppingCart.plus(100);
                    break;
                case 2:
                    shoppingCart.add("Тапки");
                    shoppingCart.plus(1000);
                    break;
                case 3:
                    shoppingCart.add("Куртка");
                    shoppingCart.plus(11500);
                    break;
                case 4:
                    shoppingCart.add("Штаны");
                    shoppingCart.plus(500);
                    break;
                case 5:
                    break;
            }
        }
        shoppingCart.showCart();
        shoppingCart.showTotal();
    }
}
