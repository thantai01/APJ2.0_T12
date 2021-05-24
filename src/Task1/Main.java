package Task1;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product product1 = new Product("Honda","CBR-150R",1,2500);
        product1.setSpecialize(new Specialize(122,135.5,1.8,"Repsol"));

    }
}
