package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner entrada= new Scanner(System.in);

        int nota[] = new int[4];
        int mayor = 0;
        String alumnoM = new String();
        String ff = new String();
        String asignaturas[] = new String[4];
        String nombre;
        String falla[] = new String[4];
        int n = 1;

        while(n!=2) {

            System.out.println("===                   PROMEDIOS                 ===");
            System.out.println("===Favor ingrese el nombre de Alumno a Promediar===");
            System.out.println("Nombre del Alumno: ");
            nombre = entrada.nextLine();

            for (int y = 0; y < 4; y++) {
                System.out.println("Asignatura  #" + (y + 1) + ":");
                asignaturas[y] = entrada.nextLine();
                System.out.println("Nota #" + (y + 1) + ":");
                nota[y] = entrada.nextInt();
                falla[y] = entrada.nextLine();

                if(nota[y]>mayor){
                    mayor=nota[y];
                    alumnoM= asignaturas[y];
                }
            }

            double promedio;
            promedio=(nota[0]+nota[1]+nota[2]+nota[3])/4;

            System.out.println("Promedio del alumno:"+nombre+" es:"+promedio+"%");
            System.out.println("su nota mas alta fue en la clase de: "+alumnoM+" con la nota de: "+mayor+"%");
            System.out.println("Desea repetir?");
            System.out.println("1. Si");
            System.out.println("2. No");
            n = entrada.nextInt();
            ff = entrada.nextLine();
        }


    }
}