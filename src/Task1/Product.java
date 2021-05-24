package Task1;

public class Product {
    private String brand;
    private String name;
    private int type;
    private float price;
    private Specialize specialize;

    public Product() { }

    public Product(String brand, String name, int type, float price) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.price = price;
        this.specialize = new Specialize();

    }

    public void setSpecialize(Specialize specialize) {
        this.specialize = specialize;
    }

    public Specialize getSpecialize() {
        return specialize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                "," + specialize +
                '}';
    }
}
