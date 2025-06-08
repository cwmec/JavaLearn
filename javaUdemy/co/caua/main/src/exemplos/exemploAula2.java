package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class exemploAula2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double c = exemploAulaCalculator.circunference(radius);

        double v = exemploAulaCalculator.volume(radius);

        System.out.printf("circunference: %.2f%n",c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI calculator: %.2f",exemploAulaCalculator.PI);
    }
}
