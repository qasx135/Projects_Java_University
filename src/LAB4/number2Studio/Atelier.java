package LAB4.number2Studio;

public class Atelier {
    public static void dressWomen(Clothes[] mas) {
        for (Clothes ma : mas) {
            Class[] inter = ma.getClass().getInterfaces();
            for (Class cl : inter) {
                if ("WomenClothing".equals(cl.getSimpleName())) {
                    System.out.println(((WomenClothing) ma).dressWomen());
                }
            }
        }
    }
    public static void dressMen(Clothes[] mas) {
        for (Clothes ma : mas) {
            Class[] inter = ma.getClass().getInterfaces();
            for (Class cl : inter) {
                if ("MenClothing".equals(cl.getSimpleName())) {
                    System.out.println(((MenClothing) ma).dressMan());
                }
            }
        }
    }

}
