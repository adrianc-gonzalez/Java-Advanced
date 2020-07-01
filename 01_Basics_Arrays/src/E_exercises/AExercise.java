/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/1/20
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
package E_exercises;

import java.util.Scanner;

public class AExercise {

    /*
    * Use un arreglo unidimensional para resolver el siguiente problema:
    * Escriba una aplicación que reciba como entrada cinco números, cada uno de los cuáles debe
    * estar entre 10 y 100.
    * A medida que se lea cada número, muéstrelo solamente si no es un duplicado de un número
    * que ya se haya leído.
    * Prepárese para el “peor caso”, en el que los cinco números son diferentes. Use el arreglo más
    * pequeño que sea posible para resolver este problema. Muestre el conjunto completo de valores
    * únicos introducidos, después de que el usuario introduzca cada nuevo valor.
    * El método de recepción de valores por parte del usuario, queda a elección del estudiante.
    * */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];


        int numerosIngresados = 0;
        while(numerosIngresados < nums.length) {
            System.out.println("Proporcione número: ");
            int num = scanner.nextInt();

            if(num >= 10 &&  num <= 100) {
                boolean exist = false;
                for(int j = 0; j < nums.length; j++) {
                    if(nums[j] == num) {
                        exist = true;
                        break;
                    }
                }
                if(!exist) {
                    System.out.println("num = " + num);
                    nums[numerosIngresados] = num;
                    numerosIngresados++;
                }
            }

            for(int j = 0; j < nums.length; j++) {
                System.out.print("nums["+j+"] = " + nums[j] + "\t");
            }
            System.out.println("");
        }
    }
}
