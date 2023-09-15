package LAB4.number2Studio;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(Sizes size, Double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public String dressMan() {
        return "Dress man -> TShirt | Size -> " + this.size.toString() + " | Color -> " + this.color + " | cost -> " + this.cost;
    }

    @Override
    public String dressWomen() {
        return "Dress woman -> TShirt | Size -> " + this.size.toString() + " | Color -> " + this.color + " | cost -> " + this.cost;
    }
}
