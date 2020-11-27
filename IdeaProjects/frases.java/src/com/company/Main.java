package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        String cad = "";
        char[] Arraycad;
        char caracter;
        int contador = 0;

        System.out.println("Escriba una frase");
        cad = lectura.nextLine();
        Arraycad = cad.toCharArray();

        for (int i = 0; i < Arraycad.length; i++)
        {
            caracter = Arraycad[i];
            for (int j = 0; j < Arraycad.length; j++)
            {
                if (Arraycad[j] == caracter)
                {
                    contador++;
                }
            }
            System.out.println(Arraycad[i] + " " + contador);
            contador = 0;
        }
    }

}
