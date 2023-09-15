package LAB4.number1Seasons;

public class Class {
    public static void main(String[] args) {
        Seasons ses = Seasons.AUTUMN;
        exer2(ses);
        for (Seasons ss : Seasons.values()) {
            System.out.println(ss.toString() + " " + ss.getDescription() + "Avg temperature is: " + ss.getNumberSeason());
        }

    }

    public static void exer2(Seasons s) {
        switch (s) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }
}
