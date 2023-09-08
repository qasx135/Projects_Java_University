package LAB2.number8;

public class ToReverse {
    public static void reverse(String[] arr) {
        int len = arr.length;;
        for (int i = 0; i < len / 2; i++) {
            String elem = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = elem;
        }
    }
}
