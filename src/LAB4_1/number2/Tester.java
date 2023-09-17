package LAB4_1.number2;

public class Tester {
    public static void main(String[] args) {
        Phone one = new Phone("81111111111", "ASDF12345", 123.45);
        Phone two = new Phone("82122222222", "KJHSDGF123", 732.45);
        Phone three = new Phone("11231236786", "X123JHADS", 27.45);
        Phone four = new Phone();
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());
        System.out.println(one.receiveCall("Jhon") + " по номеру " + one.getNumber());
        System.out.println(two.receiveCall("Michael") + " по номеру " + two.getNumber());
        System.out.println(three.receiveCall("Len", "89876543210") + " по номеру " + three.getNumber());
        one.sendMessage("89876543211",
                "89991112233", "80001237328", "95679873456");
    }
}
