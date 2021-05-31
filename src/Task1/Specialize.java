package Task1;

import java.io.Serializable;

public class Specialize implements Serializable {
    private static final long serialVersionUID = -266706354210367639L;
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
