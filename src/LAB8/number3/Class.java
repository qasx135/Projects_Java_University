package LAB8.number3;

public class Class {
    public static void main(String[] args) {
        three(10, 5);
    }

    public static void three(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; --i) {
                System.out.print(i + " ");
            }
        }
    }
}
