package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        exercicioPooArea area = new exercicioPooArea();
        System.out.println("enter rectangle width and heigth: ");
        area.width = scanner.nextDouble();
        area.heigth = scanner.nextDouble();

        System.out.println("AREA: " + area.area());
        System.out.println("PERIMETER: "+ area.perimeter());
        System.out.printf("DIAGONAL: %.2f%n",area.diagonal());
    }
}
