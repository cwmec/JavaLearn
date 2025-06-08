package exercicio;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("senha: ");
        int senha = scanner.nextInt();
        while (senha != 2002){
            System.out.println("senha incorreta");
            senha = scanner.nextInt();
        }
        System.out.println("acesso permitido");
        scanner.close();
    }
}
