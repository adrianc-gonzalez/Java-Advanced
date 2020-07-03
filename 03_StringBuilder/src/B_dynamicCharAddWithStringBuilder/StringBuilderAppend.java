/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/2/20
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */
package B_dynamicCharAddWithStringBuilder;

public class StringBuilderAppend {

    public static void main(String[] args) {

        Object object = "hola";
        String cadena = "adios";
        char[] chars = {'a','b','c','d','e','f'};
        boolean valorBoolean = true;
        char valorChar = 'z';
        int valorInt = 7;
        long valorLong = 1000000000000L;
        float valorFloat = 2.5F;
        double valorDouble = 33.3;
        short valorShort = 1456;
        byte valorByte = 123;

        StringBuilder ultimoBuffer = new StringBuilder("ultimo buffer");
        StringBuilder builder = new StringBuilder();

        builder.append(object)
                .append("\n")
                .append(cadena)
                .append("\n")
                .append(chars)
                .append("\n")
                .append(chars, 0, 3)
                .append("\n")
                .append(valorBoolean)
                .append("\n")
                .append(valorByte)
                .append("\n")
                .append(valorChar)
                .append("\n")
                .append(valorDouble)
                .append("\n")
                .append(valorFloat)
                .append("\n")
                .append(valorInt)
                .append("\n")
                .append(valorLong)
                .append("\n")
                .append(valorShort)
                .append("\n")
                .append(ultimoBuffer);

        System.out.printf("builder contiene%n%s%n", builder.toString());

        /*
        * El compilador puede usar StringBuilder y métodos append para implementar los operadores + y += de concatenación
        * de String
        * */
        String cadena1 = "Hola";
        String cadena2 = "BC";
        int valor = 22;

        /*
        * La instrucción String s = cadena1 + cadena2 + valor
        * Dicha concatenación puede ser realizada con StringBuilder de la siguiente manera:
        * */
        String s = new StringBuilder().append("hola").append("BC").append(22).toString();
        System.out.printf("%s%n", s);

        /*
        * La instrucción s + "!"
        * puede ser realizada en StringBuilder de la siguiente manera:
        * */
        s = new StringBuilder().append(s).append("!").toString();
        System.out.printf("%s", s);
    }
}
