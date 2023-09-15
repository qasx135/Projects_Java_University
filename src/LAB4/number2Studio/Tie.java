package LAB4.number2Studio;

public class Tie extends Clothes implements MenClothing {
    public Tie(Sizes size, Double cost, String color) {
        this.color = color;
        this.size = size;
        this.cost = cost;
    }
    @Override
    public String dressMan() {
        return "Dress man -> Tie | Size -> " + this.size.toString() + " | Color -> " + this.color + " | cost -> " + this.cost;

    }
}
