package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPooVetor {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        int[] vect = new int[n];

        while (n>10){
            System.out.println("somente a baixo do decimo digito!");
        }
        for (int i = 0; i< vect.length;i++){
            System.out.println("digite um numero:");
            vect[i] = scanner.nextInt();
        }
        System.out.println("numeros negativos");
        for (int i = 0; i< vect.length;i++){
            if (vect[i]<0){
                System.out.println(vect[i]);
            }
        }


       scanner.close();
    }
}