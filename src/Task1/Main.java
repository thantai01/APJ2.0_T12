package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product("Honda","none1",1,999,new Specialize(150,"##")));
        productManager.addProduct(new Product("Yamaha","none2",1,1999,new Specialize(250,"##")));
        productManager.addProduct(new Product("Suzuki","none3",1,888,new Specialize(600,"##")));
        productManager.addProduct(new Product("Kawasaki","none4",1,2999,new Specialize(1000,"##")));
//        //Main
        Menu.intro();
        programProcess(productManager);

    }
    static void programProcess(ProductManager productManager) {
        Scanner sc = new Scanner(System.in);
        int actionInput;
        do {
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
                    String oldProductName = sc.nextLine();
                    sc.nextLine();
                    Product newProduct = Menu.newProduct();
                    productManager.updateProduct(oldProductName,newProduct);
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
            }

        } while (actionInput > 0 && actionInput <7);
    }
}
