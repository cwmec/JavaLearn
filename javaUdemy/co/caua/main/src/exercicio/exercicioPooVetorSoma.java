package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPooVetorSoma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        double[] vect = new double[n];

        while (n>10){
            System.out.println("somentoe a baixo do decimo digito:");
        }
        for (int i = 0;i< vect.length;i++){
            System.out.println("digite um numero:");
            vect[i] = scanner.nextInt();
        }

        double soma = 0.0;

        for (int i = 0; i< vect.length;i++){
            soma += vect[i];
        }

        double media = soma / n;

        System.out.print("valore: ");
        for (int i = 0; i< vect.length;i++){
            System.out.printf("%.1f ",vect[i]);
        }

        System.out.println();
        System.out.println("soma = "+soma);
        System.out.println("media = "+ media);



        scanner.close();
    }
}
