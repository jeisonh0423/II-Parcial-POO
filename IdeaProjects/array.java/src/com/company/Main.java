package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n=1;

        while(n!=2) {

            Scanner entrada = new Scanner(System.in);
            int edad[] = new int[5];
            String nombres[] = new String[5];
            String falla[] = new String[5];

            for (int x = 0; x < 5; x++) {
                System.out.println("Ingrese nombre: ");
                nombres[x] = entrada.nextLine();
                System.out.println("Ingrese edad: ");
                edad[x] = entrada.nextInt();
                falla[x] = entrada.nextLine();
            }

            for (int y = 0; y < 5; y++) {
                System.out.println(nombres[y] + " Cuya edad es: " + edad[y] + " annios");
            }

            System.out.println("Desea repetir?");
            System.out.println("1. Si");
            System.out.println("2. No");
             n = entrada.nextInt();
        }
    }
}



