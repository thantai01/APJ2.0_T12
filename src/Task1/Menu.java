package Task1;

import java.util.Scanner;

public class Menu {
    static void intro() {
        System.out.println("WELCOME TO THE PRODUCT MANAGER! All actions below is allowed here. Let's choose: ");
    }

    static void action() {
        System.out.println("# Action : ");
        System.out.println("1. Add new product: ");
        System.out.println("2. Display products: ");
        System.out.println("3. Edit product: ");
        System.out.println("4. Delete product: ");
        System.out.println("5. Find product: ");
        System.out.println("6. Sort List: ");
        System.out.println("7. Exit. ");
    }

    static void addProduct(ProductManager productManager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("# Please enter product information:");
        System.out.print("Brand name: ");
        String brand = sc.nextLine();
        System.out.print("Product name: ");
        String name = sc.nextLine();
        System.out.print("Type: ");
        int type = sc.nextInt();
        System.out.print("Price: ");
        float price = sc.nextFloat();
        System.out.print("Cube Centimeter: ");
        int cc = sc.nextInt();
        sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        productManager.addProduct(new Product(brand,name,type,price,new Specialize(cc,color)));
    }

    static void deleteByName(ProductManager productManager) {
        System.out.print("Enter a product name want to delete: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        productManager.deleteByName(name,productManager);

    }

    static void findBy(ProductManager productManager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5.1: Find by Brand: ");
        System.out.println("5.2: Find by Type: ");
        System.out.println("5.3: Find by CC's: ");
        System.out.println("5.4: Find by range of price: ");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.print("Enter brand name: ");
                sc.nextLine();
                String brand = sc.nextLine();
                System.out.println("# Result : ");
                productManager.findByBrand(brand);
                break;
            case 2:
                System.out.print("Enter product type: ");
                int type = sc.nextInt();
                productManager.findByType(type);
                break;
            case 3:
                System.out.print("Enter product CC's: ");
                int cc = sc.nextInt();
                productManager.findByCC(cc);
                break;
            case 4:
                System.out.print("Enter min price: ");
                int min = sc.nextInt();
                System.out.print("Enter max price: ");
                int max = sc.nextInt();
                productManager.findByPriceRange(min,max);
                break;
            default:
                System.out.println("Invalid!");
        }
    }

    static Product newProduct() {
       Scanner sc = new Scanner(System.in);
        System.out.print("New Brand: ");
        String brand = sc.nextLine();
        System.out.print("New name: ");
        String name = sc.nextLine();
        System.out.print("New Type: ");
        int type = sc.nextInt();
        System.out.print("New Price: ");
        int price = sc.nextInt();
        System.out.print("New CC: ");
        int cc = sc.nextInt();
        sc.nextLine();
        System.out.print("New Color: ");
        String color = sc.nextLine();
        return new Product(brand,name,type,price,new Specialize(cc,color));
    }

    static void sortBy(ProductManager productManager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("6.1: Sort by Brand ");
        System.out.println("6.2: Sort by Price ");
        System.out.println("6.3: Sort by CC ");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                productManager.sortByBrand();
                productManager.printProduct();
                break;
            case 2:
                productManager.sortByPrice();
                productManager.printProduct();
                break;
            case 3:
                productManager.sortByCC();
                productManager.printProduct();
                break;
            default:
                System.out.println("Invalid!");
        }
    }

//    static int countItem(ProductManager productManager) {
//        int count = 0;
//        for (int i = 0; i < productManager.; i++) {
//
//        }
//    }
}


