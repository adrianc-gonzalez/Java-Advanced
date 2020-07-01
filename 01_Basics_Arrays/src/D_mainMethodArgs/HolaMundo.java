/**
 * Created by IntelliJ IDEA.
 * User: Adrian Gonzalez
 * Date: 7/1/20
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
package D_mainMethodArgs;

public class HolaMundo {

    public static void main(String[] args) {

        for(String elemento : args) {
            System.out.println("elemento = " + elemento);
        }
    }
}