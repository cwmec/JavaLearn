package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        exercicio5Rent[] vect = new exercicio5Rent[10];

        System.out.println("how many rooms will be rented?");
        int n = scanner.nextInt();

        for (int i = 1; i<=n;i++){
            System.out.println();
            System.out.println("rent #" + i + ":");
            System.out.println("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();
            System.out.println("Room: ");
            int roomNumber = scanner.nextInt();

            vect[roomNumber] = new exercicio5Rent(name, email);
        }

        System.out.println();
        System.out.println("busy rooms: ");
        for(int i = 0; i < 10;i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }



        scanner.close();
    }
}
