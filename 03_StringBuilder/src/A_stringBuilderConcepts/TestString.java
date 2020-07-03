/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/2/20
 * Time: 6:45 PM
 * To change this template use File | Settings | File Templates.
 */
package A_stringBuilderConcepts;

public class TestString {

    public static void main(String[] args) {

        String hola = "hola";
        String hola2 = hola;

        hola = "Adios";

        System.out.println("hola es: " + hola);
        System.out.println("hola2 es: " + hola2);

        hola2 = hola;

        System.out.println("Ahora hola2 es: " + hola2);
    }
}