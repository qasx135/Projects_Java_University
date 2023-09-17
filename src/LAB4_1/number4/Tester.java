package LAB4_1.number4;

public class Tester {
    public static void main(String[] args) {
        Double[][] m = {{1.0, 2.0}, {12.3, 1.4}};
        Matrix mt = new Matrix(2, 2,  m);
        mt.show();
        mt = mt.multNumber(10.);
        System.out.println();
        mt.show();
        System.out.println();
        Double[][] n_m = {{5., 4.}, {1., 2.}};
        Matrix m_2 = new Matrix(2, 2, n_m);
        mt = mt.sum(m_2);
        mt.show();
    }
}
