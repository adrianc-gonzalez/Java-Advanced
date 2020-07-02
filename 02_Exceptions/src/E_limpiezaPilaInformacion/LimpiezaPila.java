/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/2/20
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
package E_limpiezaPilaInformacion;

public class LimpiezaPila {

    public static void main(String[] args) {

        new LimpiezaPila().metodo1();
    }

    public void metodo1() {
        try {
            metodo5();
        } catch(Exception ex) {
            System.err.println(ex.getMessage() + " - pero tratada en metodo1()");
        }
    }

    public void metodo5() throws Exception {
        metodo4();
    }

    public void metodo4() throws Exception {
        try {
            metodo2();
        } catch(Exception ex) {
            System.err.println(ex.getMessage() + " - pero tratada en metodo4()");
            throw ex;
        }
    }

    public void metodo2() throws Exception {
        metodo3();
    }

    public void metodo3() throws Exception {
        try {
            throw new Exception("Excepción generada en metodo3()");
        } catch(Exception ex) {
            System.err.println("Excepción tratada en metodo3()");
            throw ex;
        }
    }
}