package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPoo2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        exercicioPooSalary newSalary = new exercicioPooSalary();

        System.out.println("Name: ");
        newSalary.nome = scanner.nextLine();
        System.out.println("Gross Salary: ");
        newSalary.salary = scanner.nextDouble();
        System.out.println("Tax: ");
        newSalary.tax = scanner.nextDouble();

        System.out.printf("employee: %s, $ %.2f%n",newSalary.nome,newSalary.NetSalary());

        System.out.print("which porcentage to increase salary: ");
        double percentage = scanner.nextDouble();
        newSalary.IncreaseSalary(percentage);

        System.out.println("Update data: "+ newSalary.toString());
    }
}
