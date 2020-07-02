/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/2/20
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
package E_limpiezaPilaInformacion;

public class LimpiezaPila2 {

    public static void main(String[] args) {
        try {
            metodo1();
        } catch(Exception ex) {
            System.err.printf("%s%n%n", ex.getMessage());
            ex.printStackTrace();
            StackTraceElement[] elements = ex.getStackTrace();

            System.out.println("\nRastreo de la pila de getStackTrace():\n");
            System.out.println("Clase\t\t\t\t\t\t\t\t\t\tArchivo\t\t\t\t\tLínea\t\tMétodo");

            for(StackTraceElement element : elements) {
                System.out.printf("%s\t\t", element.getClassName());
                System.out.printf("%s\t\t", element.getFileName());
                System.out.printf("%s\t\t\t", element.getLineNumber());
                System.out.printf("%s\n", element.getMethodName());
            }
        }
    }

    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        metodo3();
    }

    public static void metodo3() throws Exception {
        throw new Exception("La excepción se lanzó en el metodo3()");
    }
}