package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero = 1;
        int number;

        while (numero != 2) {

            System.out.println("Tabla de multiplicar del 1 al 12");
            Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce un número entero: ");
            number = entrada.nextInt();

            if (number > 0 || number <= 12) {
                System.out.println("Tabla del " + number);
                for (int i = 1; i <= 12; i++) {
                    System.out.println(number + " * " + i + " = " + number * i);
                }
                System.out.println("Desea realizar otra tabla? ");
                System.out.println("presione 1 si desea repetir");
                System.out.println("presione 2 si desea finalizar");
                numero = entrada.nextInt();
            }
        }
    }
}
