package LAB2.number8;

public class Test {
    public static void main(String[] args) {
        String[] mas = {"1", "2", "3", "4", "5"};
        ToReverse.reverse(mas);
        for (String elem : mas) {
            System.out.print(elem + " ");
        }
    }
}
