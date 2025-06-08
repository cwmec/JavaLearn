package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Quantos valores vai ter cada vetor?");
        n = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores do vetor A:");

        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");

        for (int i = 0; i<n; i++){
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i<n;i++){
            c[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE: ");

        for (int i = 0; i<n ; i++){
            System.out.println(c[i]);
        }

        scanner.close();
    }
}
