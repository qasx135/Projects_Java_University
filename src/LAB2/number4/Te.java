package LAB2.number4;

public class Te {
    public static void main(String[] args) {
        Shop shop = new Shop(5);
        String info;
        shop.addPc("1PC", 1);
        shop.addPc("2PC", 2);
        shop.addPc("3PC", 3);
        shop.addPc("4PC", 4);
        shop.addPc("5PC", 5);
        shop.addPc("6PC", 6);
        shop.addPc("7PC", 7);
        shop.delPCByNumber(6);
        info = shop.findPcByNumber(7);
        shop.toString();
        System.out.println(info);
    }
}
