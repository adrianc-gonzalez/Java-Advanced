/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/2/20
 * Time: 11:20 AM
 * To change this template use File | Settings | File Templates.
 */
package B_rastreoPila;

import java.util.Scanner;

public class DivisionEntreCero {

    public static int cociente3(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static int cociente2(int numerador, int denominador) {
        return cociente3(numerador, denominador);
    }

    public static int cociente(int numerador, int denominador) {
        return cociente2(numerador, denominador);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un numerador entero:");
        int numerador = scanner.nextInt();

        System.out.println("Introduzca un denominador entero:");
        int denominador = scanner.nextInt();

        int resultado = cociente(numerador, denominador);
        System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
    }
}