package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPoo5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number:");
        int number = scanner.nextInt();
        System.out.println("Enter account holder:");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
        char response = scanner.next().charAt(0);
        if (response == 'Y' || response == 'y'){
            System.out.println("Enter initial deposit value:");
            double initialDeposit = scanner.nextDouble();
            account = new Account(number,holder,initialDeposit);
        }else {
            account = new Account(number,holder);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(account.toString());

        System.out.println();
        System.out.println("enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        account.deposit(depositValue);
        System.out.println("updated account data:");
        System.out.println(account.toString());

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("updated account data:");
        System.out.println(account.toString());




        scanner.close();
    }
}
