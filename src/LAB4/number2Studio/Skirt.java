package LAB4.number2Studio;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(Sizes size, Double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public String dressWomen() {
        return "Dress woman -> Skirt | Size -> " + this.size.toString() + " | Color -> " + this.color + " | cost -> " + this.cost;
    }
}
