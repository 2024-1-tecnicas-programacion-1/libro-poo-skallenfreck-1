package com.mycompany.libropoo;

import java.util.Scanner;

/**
 * Clase principal
 */
public class Principal {

    /**
     * Metodo inicial que es ejecutado
     *
     * @param args
     *
     * Complejidad tenporal: o(1) Tiempo constante
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean leido = false;
        System.out.println("Por favor ingrese el título del libro");
        String titulo = sc.nextLine();
        System.out.println("Por favor ingrese el autor del libro");
        String autor = sc.nextLine();
        System.out.println("Por favor ingrese el género del libro");
        String genero = sc.nextLine();
        System.out.println("Por favor ingrese el año de publicación del libro");
        int anoPublicacion = sc.nextInt();

        Libro datosLibro = new Libro(titulo, autor, anoPublicacion, leido, genero);
        System.out.println(datosLibro.mostrarInformacion());
        datosLibro.marcarLeido();
        System.out.println(datosLibro.libroLeido());
        System.out.println(datosLibro.antiguo());
    }
}
