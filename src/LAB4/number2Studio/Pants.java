package LAB4.number2Studio;

public class Pants extends Clothes implements WomenClothing, MenClothing{
    public Pants(Sizes size, Double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public String dressMan() {
        return "Dress man -> Pants | Size -> " + this.size.toString() + " | Color -> " + this.color + " | cost -> " + this.cost;
    }

    @Override
    public String dressWomen() {
        return "Dress woman -> Pants | Size -> " + this.size.toString() + " | Color -> " + this.color + " | cost -> " + this.cost;
    }
}
