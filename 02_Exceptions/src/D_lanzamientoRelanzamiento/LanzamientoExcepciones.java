/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/2/20
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 */
package D_lanzamientoRelanzamiento;

public class LanzamientoExcepciones {

    public static void main(String[] args) {

        try {
            lanzarExcepcion(-1);
        } catch(Exception ex) {
            System.err.println("La excepción se manejó en main");
            System.err.println(ex);
        }

        noLanzarExcepcion();
    }

    public static void lanzarExcepcion(int numeroMayoCero) throws Exception {

        if(numeroMayoCero < 0) {
            throw new Exception("El método lanza Excepción, no puede recibir números menores a cero");
        }
        /*try {
            System.out.println("Método lanzarExcepcion()");
            throw new Exception();
        } catch(Exception ex) {
            System.out.println("La excepción se manejó en el método lanzarExcepcion()");
            throw ex;
        }*/
    }

    public static void noLanzarExcepcion() {
        try {
            System.out.println("Método noLanzarExcepcion()");
        } catch(Exception ex) {
            System.err.println(ex);
        } finally {
            System.err.println("Se ejecutó finally en noLanzarExcepcion()");
        }

        System.out.println("Fin del método noLanzarExcepcion()");
    }
}