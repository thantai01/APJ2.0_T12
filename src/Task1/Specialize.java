package Task1;

public class Specialize {
    private int maxSpeed;
    private double weight;
    private double length;
    private String color;

    public Specialize() { }

    public Specialize(int maxSpeed, double weight, double length, String color) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.length = length;
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Specialize {" +
                "maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", length=" + length +
                ", color='" + color + '\'' +
                '}';
    }
}
