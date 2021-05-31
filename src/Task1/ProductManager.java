package Task1;

import java.util.*;

public class ProductManager{
    public List<Product> productList = null;

    public ProductManager() {
        this.productList = new LinkedList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void printProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void deleteByName(String name, ProductManager product) {
        int indexOfProduct = checkProductIndex(name);
        if(indexOfProduct ==-1) {
            System.out.println("Product not found");
        } else productList.remove(indexOfProduct);
    }

    public void findByBrand(String brand) {
        for(Product product:productList) {
            if(product.getBrand().equals(brand)) {
                System.out.println(product + "\n");
            }
        }
    }

    public void findByType(int type) {
        for(Product product : productList) {
            if(product.getType()==type)
                System.out.println(product + "\n");
        }
    }

    public void findByCC(int cc) {
        for(Product product:productList) {
            if(product.getSpecialize().getCc()==cc) {
                System.out.println(product + "\n");
            }
        }
    }

    public void findByPriceRange(int min, int max) {
        for(Product product : productList) {
            if(product.getPrice()>=min && product.getPrice()<=max) {
                System.out.println(product + "\n");
            } else if (product.getPrice()<min || product.getPrice()>max) {
                System.out.println("No result");
            }
        }
    }

    public int checkProductIndex(String name) {
        for(int i = 0; i < productList.size();i++) {
            if(productList.get(i).getName().equals(name))
                return i;
        } return -1;
    }

    public void updateProduct(String name, Product product) {
        int productIndex = checkProductIndex(name);
        if(productIndex ==-1) {
            System.out.println("Product not found");
        } else productList.set(checkProductIndex(name),product);
    }

    public void sortByBrand() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return  o1.getBrand().compareTo(o2.getBrand());
            }
        });
        List<Product> sortByBrand = new ArrayList<>();
        for(Product product :productList) {
            sortByBrand.add(product);
        }
        this.productList = sortByBrand;
    }

    public void sortByPrice() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        List<Product> sortByPrice = new ArrayList<>();
        for(Product product:productList) {
            sortByPrice.add(product);
        }
        this.productList = sortByPrice;
    }

    public void sortByCC() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getSpecialize().getCc() - o2.getSpecialize().getCc();
            }
        });
        List<Product> sortByCC = new ArrayList<>();
        for(Product product : productList) {
            sortByCC.add(product);
        }
        this.productList = sortByCC;
    }

    public int countItem() {
        int count = 0;
        for(Product product:productList)
            count+=1;
        return count;
    }
}
