package com.mycompany.libropoo;

import java.util.Calendar;

/**
 * clase Libro
 *
 * @author USUARIO
 */
public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private int anoPublicacion = 0;
    private boolean leido;

    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);

    /**
     * Metodo constructor para inicialiizar los atributos de la clase
     *
     * @param titulo
     * @param autor
     * @param anoPublicacion
     * @param leido
     * @param genero
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Libro(String titulo, String autor, int anoPublicacion, boolean leido, String genero) {

        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacion = anoPublicacion;
        this.leido = leido;

    }

    /**
     * Metodo que imprime las variables titulo, autor, anoPublicacion y genero
     *
     * @return String "Título: ["+titulo+"], Autor: ["+autor+"], Año de
     * publicación: ["+anoPublicacion+"], Género: ["+genero+"]"
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String mostrarInformacion() {
        return "Título: [" + titulo + "], Autor: [" + autor + "], Año de publicación: [" + anoPublicacion + "], Género: [" + genero + "]";
    }

    /**
     * Metodo que cambia el valor de la variable leido por true
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void marcarLeido() {
        leido = true;
    }

    /**
     * Metodo que verifica si el libro se considera antiguo o no
     *
     * @return true // false
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public boolean esAntiguo() {
        return (year - anoPublicacion) > 50;
    }

    /**
     * Metodo que imprime por pantalla si el libro fue leído o no
     *
     * @return "El libro ya fue leído" // "El libro no ha sido leído"
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String libroLeido() {
        if (leido == true) {
            return "El libro ya fue leído";
        } else {
            return "El libro no ha sido leído";
        }
    }

    /**
     * Metodo que imprime por pantalla si el libro es antiguo o no
     *
     * @return "El libro es Antiguo" // "El libro no es Antiguo"
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String antiguo() {
        if (esAntiguo() == true) {
            return "El libro es Antiguo";
        } else {
            return "El libro no es Antiguo";
        }
    }
}
