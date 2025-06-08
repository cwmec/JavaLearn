package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n,quantPares;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = scanner.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i< vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("numeros pares: ");


        quantPares = 0;
        for (int i = 0; i< vetor.length;i++){
            if (vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
               quantPares++;

            }
        }
        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", quantPares);



        scanner.close();
    }
}
