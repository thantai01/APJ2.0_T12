package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        baseList(productManager);
        Menu.intro();
        programProcess(productManager);
    }
    static void programProcess(ProductManager productManager) {
        Scanner sc = new Scanner(System.in);
        int actionInput;
        do {
            System.out.println("Have " + productManager.countItem() + " item left in a list!!! " );
            Menu.action();
            actionInput = sc.nextInt();
            switch (actionInput) {
                case 1:
                    Menu.addProduct(productManager);
                    System.out.println("Product has been added!!");
                    System.out.println("-----------");
                    break;
                case 2:
                    System.out.println("# Here's your product list: ");
                    productManager.printProduct();
                    System.out.println("-----------");
                    break;
                case 3:
                    System.out.println("Enter product name");
                    sc.nextLine();
                    String oldProductName = sc.nextLine();
                    Product newProduct = Menu.newProduct();
                    productManager.updateProduct(oldProductName,newProduct);
                    System.out.println("Item has updated");
                    System.out.println("-----------");
                    break;
                case 4:
                    Menu.deleteByName(productManager);
                    System.out.println("Your item was deleted!!");
                    System.out.println("-----------");
                    break;
                case 5:
                    Menu.findBy(productManager);
                    System.out.println("-----------");
                    break;
                case 6:
                    Menu.sortBy(productManager);
                    System.out.println("-----------");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid! Re-enter again");
            }

        } while (actionInput > 0 && actionInput <7);
    }

    static void baseList(ProductManager productManager) {
        productManager.addProduct(new Product("Honda","CBR150R",1,2300,new Specialize(149,"Repsol")));
        productManager.addProduct(new Product("Yamaha","R15V3",1,2500,new Specialize(150,"Black-Yellow")));
        productManager.addProduct(new Product("Suzuki","GSX150R",1,2100,new Specialize(148,"Black")));
        productManager.addProduct(new Product("Honda","CB150R",2,3000,new Specialize(150,"Red-Black")));
        productManager.addProduct(new Product("Yamaha","MT15",2,2200,new Specialize(155,"Black")));
        productManager.addProduct(new Product("Suzuki","GSX150S",2,2000,new Specialize(145,"Blue")));
    }
}
