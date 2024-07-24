package Task2;

import java.util.Scanner;

class Product {

    int pid;
    double price;
    double quantity;

    public Product(int pid, double price, double quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class XYZ{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from user and store in an array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product " + (i + 1) + " details:");
            System.out.print("PID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }


        int highestPricePid = highpriceproduct(products);
        System.out.println("PID of the product with the highest price: " + highestPricePid);

        double totalAmountSpent = totalamtonallproduct(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }
    // Method to find PID of the product with the highest price
    public static int highpriceproduct(Product[] products) {
        int pid = products[0].pid;
        double highestPrice = products[0].price;

        for (Product product : products) {
            if (product.price > highestPrice) {
                highestPrice = product.price;
                pid = product.pid;
            }
        }
        return pid;
    }

    // Method to calculate and return the total amount spent on all products
    public static double totalamtonallproduct(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount = totalAmount + product.price * product.quantity;
        }
        return totalAmount;
    }

}
