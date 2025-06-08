package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class exemploVetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("vai digitar quantos numeros?");
        int n = scanner.nextInt();
        while (n > 10){
            System.out.println("so digitar abaixo de 10 digitos!");
        }

        int[] vect = new int[n];
        for (int i=0; i<vect.length; i++){
            System.out.println("digite um numero:");
            vect[i] = scanner.nextInt();
        }

        System.out.println("numeros negativos:");
        for (int i = 0; i< vect.length;i++){
            if (vect[i]<0){
                System.out.println(vect[i]);
            }
        }

        scanner.close();
    }
}
