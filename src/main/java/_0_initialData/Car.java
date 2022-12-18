package _0_initialData;

public class Car {
    private String model;
    private String color;
    private int cost;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public Car(String model, String color, int cost) {
        this.model = model;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }


}
