/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/2/20
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */
package C_tryThrows;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Excepciones {

    public static int cociente(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuarCiclo = true;

        do {
            try {
                System.out.println("Introduzca un numerador entero:");
                int numerador = scanner.nextInt();

                System.out.println("Introduzca un denominador entero:");
                int denominador = scanner.nextInt();

                int resultado = cociente(numerador, denominador);
                System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
                continuarCiclo = false;
            } catch(InputMismatchException ex) {
                System.err.printf("%nExcepcion: %s%n", ex);
                scanner.nextLine();
            } catch(ArithmeticException ex) {
                System.err.printf("%nExcepcion: %s%n", ex);
                System.out.printf("Cero es un denominador inválido. Intente de nuevo.%n%n");
            } catch(NoSuchElementException ex) {
            }
        } while(continuarCiclo);
    }
}