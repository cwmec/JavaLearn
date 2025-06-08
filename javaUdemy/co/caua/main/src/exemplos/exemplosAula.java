package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class exemplosAula {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ex product = new ex();

        System.out.println("enter product data: ");
        System.out.println("name: ");
        product.name = scanner.nextLine();
        System.out.print("price: ");
        product.price = scanner.nextDouble();
        System.out.println("quantity in stock: ");
        product.quantity = scanner.nextInt();

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println(product);


        System.out.println();
        System.out.println("Enter the number of products to be remove from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println(product);

        scanner.close();

    }
}
