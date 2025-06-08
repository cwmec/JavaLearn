package exercicio;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gasolina = 0;
        int disel = 0;
        int alcool = 0;

        int tipo = scanner.nextInt();

        while (tipo != 4){
            if(tipo == 1){
                gasolina += 1;
            } else if (tipo == 2) {
                disel += 1;
            }else {
                alcool += 1;
            }
            tipo = scanner.nextInt();
        }
        System.out.println("muito obg: ");
        System.out.println("gasolina: "+gasolina);
        System.out.println("disel: "+disel);
        System.out.println("alcool: "+alcool);

        scanner.close();
    }
}
