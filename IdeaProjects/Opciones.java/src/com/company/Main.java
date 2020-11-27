package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jei = new Scanner(System.in);
        int opc;

do {

    System.out.println("Ingrese un caracter: ");
    char vocal = jei.next().charAt(0);

    switch (vocal) {
        case 'a':
        case 'A':
            System.out.println("Amigo");
            System.out.println("Atmosfera");
            System.out.println("Aleron");
            break;
        case 'e':
        case 'E':
            System.out.println("Exacto");
            System.out.println("Electricidad");
            System.out.println("Estado");
            break;
        case 'i':
        case 'I':
            System.out.println("Inmenso");
            System.out.println("Iglesia");
            System.out.println("Intenso");
            break;
        case 'o':
        case 'O':
            System.out.println("Orale");
            System.out.println("Oraculo");
            System.out.println("Ojona");
            break;
        case 'u':
        case 'U':
            System.out.println("Uva");
            System.out.println("Utero");
            System.out.println("Unisex");
            break;

        default:
            System.out.println("Esta letra no es una vocal");
    }

    System.out.println("Desea volver a ingresar una letra ");
    System.out.println("Presione (1) para ingresar una nueva letra");
    System.out.println("Presione (2) para salir");
    opc = jei.nextInt();

} while (opc == 1);

    }
}
