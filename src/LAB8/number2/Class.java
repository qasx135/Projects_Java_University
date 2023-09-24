package LAB8.number2;

public class Class {
    public static void main(String[] args) {
        two(10);
    }

    public static String two(int n) {
        if (n == 0) {
            return "";
        } else {
            two(--n);
            System.out.print((n + 1) + " ");
        }
        return "";
    }
}
