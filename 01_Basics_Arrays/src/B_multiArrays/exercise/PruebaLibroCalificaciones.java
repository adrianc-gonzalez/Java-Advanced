/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/1/20
 * Time: 1:23 PM
 * To change this template use File | Settings | File Templates.
 */
package B_multiArrays.exercise;

public class PruebaLibroCalificaciones {

    public static void main(String[] args) {

        int[][] arregloCalif = {{87,96,70}, {68,87,90}, {94,100,90}, {100,81,82}, {83,65,85}, {78,87,65}, {85,75,83}, {91,94,100}, {76,72,84}, {87,93,73}};
        LibroCalificaciones libroCalificaciones = new LibroCalificaciones("Arreglos multidimensionales. Java a Profundidad", arregloCalif);
        System.out.printf("Bienvenido al libro de calificaciones para%n%s%n%n", libroCalificaciones.getNombreCurso());

        libroCalificaciones.procesaCalificaciones();
    }
}