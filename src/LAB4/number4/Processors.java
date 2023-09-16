package LAB4.number4;

public enum Processors {
    INTEL(12.0, 12001),
    AMD(13.3, 13123);

    private double HZ;
    private int generation;

    Processors(double HZ, int generation) {
        this.generation = generation;
        this.HZ = HZ;
    }

    public double getHZ() {
        return HZ;
    }

    public int getGeneration() {
        return generation;
    }
}
