/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/2/20
 * Time: 7:16 PM
 * To change this template use File | Settings | File Templates.
 */
package A_stringBuilderConcepts;

public class StringBuilderCapLen {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hola, ¿Cómo estás?");

        /*
        * El método length proporciona el tamaño de la cadena de caracteres contenida en el objeto StringBuilder
        * El método capacity proporciona la capacidad de almacenamiento del objeto StringBuilder
        * */
        System.out.printf("builder = %s%nlongitud = %d%ncapacidad = %d%n", builder.toString(), builder.length(), builder.capacity());

        builder.ensureCapacity(75);
        System.out.printf("Nueva capacidad = %d%n%n", builder.capacity());

        builder.setLength(20);
        System.out.printf("Nueva longitud = %d%nbuilder = \"%s\"%n", builder.length(), builder.toString());
    }
}