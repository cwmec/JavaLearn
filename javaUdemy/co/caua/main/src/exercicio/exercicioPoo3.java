package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPoo3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        exercicioPooNotas nota = new exercicioPooNotas();

        System.out.println("digite as tres notas do aluno: ");
        nota.nota1 = scanner.nextDouble();
        nota.nota2 = scanner.nextDouble();
        nota.nota3 = scanner.nextDouble();

        double media = nota.resultado();
        double reprovado = nota.reprovado();

        System.out.println("FINAL GRADE: "+ media);
        if (media >= 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING "+ reprovado+ " POINTS");
        }
        scanner.close();

    }
}
