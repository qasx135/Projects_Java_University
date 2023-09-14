package LAB3.Shells.number1;

public class NumberFormatDemo1 {
    public static void main(String[] args) {
        Double d = Double.valueOf("123.123");
        double s = Double.parseDouble("12.12");
        Double to_pr = 12.12;
        short p_1 = to_pr.shortValue();
        int p_2 = to_pr.intValue();
        byte p_3 = to_pr.byteValue();
        float p_4 = to_pr.longValue();
        double p_5 = to_pr.doubleValue();
        System.out.println(to_pr);
        double l = 12.12d;
        String r = String.valueOf(l);
    }
}
