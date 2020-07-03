/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/2/20
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
package A_stringBuilderConcepts;

public class StringBuilderChars {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hola a todos");

        System.out.printf("Buffer = %s%n", builder.toString());
        System.out.printf("Caracter en 0: %s%nCaracter en 3: %s%n%n", builder.charAt(0), builder.charAt(3));

        char[] arregloChars = new char[builder.length()];
        builder.getChars(0, builder.length(), arregloChars, 0);
        System.out.println("Los caracteres son: ");

        for(char caracter : arregloChars) {
            System.out.print(caracter);
        }

        builder.setCharAt(0, 'H');
        builder.setCharAt(7, 'T');

        System.out.printf("%n%nbuilder = %s", builder.toString());

        builder.reverse();
        System.out.printf("%n%nbuilder = %s%n", builder.toString());
    }
}