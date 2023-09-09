package LAB3.RandomAndMath.number2;

public class BigTest {
    public static void main(String[] args) {
        Tester t = new Tester();
        t.show();
        System.out.print("Smallest -> ");
        System.out.println(t.showSmallest());
        System.out.print("Biggest -> ");
        System.out.println(t.showBiggest());
        System.out.println("""
                |------------|
                |  Sorting:  |
                |------------|""");
        t.sortCircles();
        t.show();
    }
}
