package _0_initialData;

public class HeavyBox { // Тяжелый ящик

    private double weight; //вес
    private double length; // длинна
    private double width; // ширина
    private double height; // высота

    public HeavyBox(double weight) {
        this.weight = weight;
    }

    public HeavyBox(double weight, double length, double width, double height) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
