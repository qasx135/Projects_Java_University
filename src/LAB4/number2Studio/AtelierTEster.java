package LAB4.number2Studio;

public class AtelierTEster {
    public static void main(String[] args) {
        Clothes[] cl = new Clothes[4];
        cl[0] = new TShirt(Sizes.XS, 135.0, "Black");
        cl[1] = new Pants(Sizes.M, 1901.32, "Red");
        cl[2] = new Skirt(Sizes.XXS, 10500.0, "Orange");
        cl[3] = new Tie(Sizes.L, 25555.8, "White");
        Atelier.dressWomen(cl);
        Atelier.dressMen(cl);
    }
}
