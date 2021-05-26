package Task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product {
    private String brand;
    private String name;
    private int type;
    private float price;
    private Specialize specialize;
    private LocalDateTime localDateTime;

    public Product() { }

    public Product(String brand, String name, int type, float price, Specialize specialize) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.price = price;
        this.specialize = specialize;
        this.localDateTime = LocalDateTime.now();
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

    public String typeProduct(int type) {
        String typeName = "none";
        switch (type) {
            case 1: typeName = "Sport";break;
            case 2: typeName = "Naked";break;
        }
        return typeName;
    }

    @Override
    public String toString() {
        return "Product [ " +
                "brand: '" + brand + '\''  +
                ", name: '" + name + '\''  +
                ", type: " + typeProduct(this.type) +
                ", price: " + price + " $" +
                " , " + specialize +
                ", Time (" + localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + ") " +
                ']';
    }
}
