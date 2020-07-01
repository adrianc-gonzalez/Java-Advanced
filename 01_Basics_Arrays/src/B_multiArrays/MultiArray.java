/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/1/20
 * Time: 1:11 PM
 * To change this template use File | Settings | File Templates.
 */
package B_multiArrays;

public class MultiArray {

    public static void main(String[] args) {

        int[][] arregloMultidimensional = {{5,6,7}, {8,9,7}};

        for (int fila = 0; fila < arregloMultidimensional.length; fila++) {
            for (int columna = 0; columna < arregloMultidimensional[fila].length; columna++) {
                System.out.println(arregloMultidimensional[fila][columna]);
            }
        }
    }
}