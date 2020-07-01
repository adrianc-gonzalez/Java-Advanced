/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/1/20
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 */
package C_variableLengthArguments;

public class PruebaArgVar {

    public static double promedio(double ... numeros) {

        double total = 0.0;
        for(double numero : numeros) {
             total += numero;
        }

        return total / numeros.length;
    }

    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 30.0;

        System.out.printf("d1 = %.0f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f",d1,d2,d3,d4);
        System.out.println("");
        System.out.printf("El promedio de d1, d2 es: %.1f%n", promedio(d1,d2));
        System.out.printf("El promedio de d1, d2, d3 es: %.1f%n", promedio(d1,d2,d3));
        System.out.printf("El promedio de d1, d2, d3, d4 es: %.1f%n", promedio(d1,d2,d3,d4));
    }
}