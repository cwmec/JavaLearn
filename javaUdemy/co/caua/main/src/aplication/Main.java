package aplication;

import entities.triangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        triangle x,y;
        x = new triangle();
        y = new triangle();

        System.out.println("digite os valores da area x: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("digite os valores da area y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("area do A é: %.4f%n",areaX);
        System.out.printf("area do B é: %.4f%n",areaY);

        if (areaX>areaY){
            System.out.println("area A é maior");

        }else {
            System.out.println("area B é maior");
        }
        scanner.close();
    }
}