package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();
        int[] vect = new int[n];
        
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i< vect.length;i++){
            System.out.println("dados da "+ (i+1)+ "a pessoa: ");
            System.out.println("nome: ");
            nome[i] = scanner.next();
            System.out.println("idade: ");
            idade[i] = scanner.nextInt();
            System.out.println("altura: ");
            altura[i]= scanner.nextDouble();
        }

        double soma = 0.0;
        for (int i =0; i< vect.length;i++){
            soma += altura[i];
        }
        double mediaAltura = soma /n;
        System.out.println();
        System.out.printf("altura media: %.2f%n",mediaAltura);

        int cont = 0;
        for (int i = 0;i< vect.length; i++){
            if (idade[i]<16){
                cont += 1;
            }
        }

        double percent = cont * 100.0 / n;
        System.out.printf("pessoas com menos de 16 anos: %.1f%%%n",percent);

        for (int i = 0;i< vect.length; i++){
            if (idade[i] < 16){
                System.out.println(nome[i]);
            }
        }

        scanner.close();
    }
}
