package LAB13.number2;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("ASD");
        System.out.println(p.toString());
        Person p2 = new Person("frikmcfvb","Maks");
        System.out.println(p2.toString());
        Person p3 = new Person("dsf,jgnds",";dlfkds","ds;kf");
        System.out.println(p3.toString());
    }
}