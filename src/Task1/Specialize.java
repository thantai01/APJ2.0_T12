package Task1;

public class Specialize {
    private int cc;
    private String color;

    public Specialize() { }

    public Specialize(int cc, String color) {
        this.cc = cc;
        this.color = color;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "(Specialize) {" +
                ", cc =" + cc +
                ", color ='" + this.color + '\'' +
                '}';
    }
}
