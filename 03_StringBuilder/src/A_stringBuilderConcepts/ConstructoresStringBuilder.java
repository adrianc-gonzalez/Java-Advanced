/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/2/20
 * Time: 6:54 PM
 * To change this template use File | Settings | File Templates.
 */
package A_stringBuilderConcepts;

public class ConstructoresStringBuilder {

    public static void main(String[] args) {

        /*
         * El constructor sin argumentos tiene una capacidad inicial de 16 caracteres (valor predeterminado de StringBuilder)
         * */
        StringBuilder builder1 = new StringBuilder();

        /*
         * El constructor que recibe como argumento un número entero, crea un StringBuilder que no contiene caracteres, y su
         * capacidad inicial es de 10 caracteres en este caso.
         * */
        StringBuilder builder2 = new StringBuilder(10);

        /*
         * Este constructor recibe un argumento String para crear un objeto StringBuilder que contiene los caracteres en el
         * arggumento String. La capoaidad inicial es el número de caracteres en el argumento String, más 16.
         * */
        StringBuilder builder3 = new StringBuilder("hola");

        System.out.printf("builder1 =  \"%s\"%n", builder1);
        System.out.printf("builder2 =  \"%s\"%n", builder2);
        System.out.printf("builder3 =  \"%s\"%n", builder3);
    }
}