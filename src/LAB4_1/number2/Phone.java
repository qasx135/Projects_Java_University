package LAB4_1.number2;

public class Phone {
    private String number = "";
    private String model = "";
    private Double weight = 0.0;

    public Phone(String number, String model, Double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.model = model;
        this.number = number;
    }

    public Phone() {
        this("00000000000", "Default", 0.0);
    }

    public String receiveCall(String name) {
        return "Звонит {" + name + "}";
    }

    public String receiveCall(String name, String number) {
        return "Звонит {" + name + " с номером " + number + "}";
    }
    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        for (String numb : numbers) {
            System.out.println(numb);
        }
    }
    @Override
    public String toString() {
        return "Number -> " + number + " " +
                "Model -> " + model + " " +
                "Weight -> " + weight;
    }
}
