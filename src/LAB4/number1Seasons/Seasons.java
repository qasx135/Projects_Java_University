package LAB4.number1Seasons;

public enum Seasons {
    WINTER (-15),
    SPRING (10),
    SUMMER (23) {
        @Override
        public String getDescription() {
            return "Теплое время года ";
        }
    },
    AUTUMN (7);

    private final int avgTemp;
    Seasons(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    public int getNumberSeason() {
        return this.avgTemp;
    }

    public String getDescription() {
        return "Холодное время года ";
    }

}
