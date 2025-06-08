package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i< vetor.length;i++){
            System.out.println("digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }

        double maior = vetor[0];
        int posiMaior = 0;

        for (int i = 0; i< vetor.length;i++){
            if (vetor[i]>maior){
                maior = vetor[i];
                posiMaior = i;
            }
        }

        System.out.println("maior valor = " + maior);
        System.out.println("posição do maior valor = "+ posiMaior);


        scanner.close();
    }
}
