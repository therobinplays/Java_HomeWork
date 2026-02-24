
package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        boolean choice = true;

        while (choice) {

            System.out.println("Enter product name:");
            String name = scan.nextLine();

            System.out.println("Enter product price:");
            double price = scan.nextDouble();
            scan.nextLine();

            Product product = new Product(name, price);
            productList.add(product);

            System.out.println("Do you want to add more products? (y/n)");
            char c = scan.next().charAt(0);
            scan.nextLine();

            if (c == 'n' || c == 'N') {
                choice = false;
            }
        }

        System.out.println("\nProduct List:");

        for (Product product : productList) {
            System.out.println(product);
        }

        scan.close();
    }
}
