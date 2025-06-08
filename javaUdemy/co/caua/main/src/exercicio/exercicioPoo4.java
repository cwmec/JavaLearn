package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPoo4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ExercicioPooConverterMoeda dolar = new ExercicioPooConverterMoeda();

        System.out.print("What is the dollar price? ");
        dolar.cotacaoDollar = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        dolar.dollar = scanner.nextDouble();
        System.out.printf("amount to be paid in reais = %.2f", dolar.total());


        scanner.close();
    }
}
