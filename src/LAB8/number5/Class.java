package LAB8.number5;

public class Class {
    public static void main(String[] args) {
        int in = s(12345);
        System.out.println(in);
    }

    public static int s(int a) {
        if (a == 0) {
            return 0;
        }
        return (a % 10 + s(a / 10));
    }
}
