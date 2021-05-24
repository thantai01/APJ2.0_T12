package Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {
    private List<Product> productList = null;

    public ProductManager() {
        this.productList = new LinkedList<>();
    }
    public void addProduct(Product product) {
        productList.add(product);
    }
    public void printProduct() {
        Iterator<Product> productIterator = productList.listIterator();
        while(!productIterator.hasNext()) {
            System.out.println(productIterator.next());
        }
    }


}
