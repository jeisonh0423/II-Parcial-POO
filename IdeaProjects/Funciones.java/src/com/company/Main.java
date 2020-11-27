package com.company;


public class Main {
    public static String saludar(String nombre)
    {

        String saludo = "Hola, Bienvenido " + nombre;

        return saludo;
    }

    public static String err(String nombre)
    {

        String err = "Ups. No pudimos validar tus datos. " + nombre + " es tu usuario?";

        return err;
    }

    public static void verificar(String user, String clave)
    {
        String userValido = "Daniel";

        String claveValida = "Jeison";


        if(userValido.equals(user) && claveValida.equals(clave))
        {

            System.out.println(saludar(clave));
            System.out.println(saludar(user));
            return;
        }

        System.out.println(err(user));

    }

    public static void main(String[] args)
    {
        String user = "Daniel";
        String clave = "Jeison";


        verificar(user, clave);


    }
}

