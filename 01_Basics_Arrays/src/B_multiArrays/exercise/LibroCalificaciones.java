/**
 * Created by IntelliJ IDEA.
 * User: Adrián González
 * Date: 7/1/20
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
package B_multiArrays.exercise;

public class LibroCalificaciones {

    private String nombreCurso;
    private int[][] calificaciones;

    public LibroCalificaciones(String nombreCurso, int[][] calificaciones) {
        this.nombreCurso = nombreCurso;
        this.calificaciones = calificaciones;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void procesaCalificaciones() {

        imprimirCalificaciones();

        System.out.printf("%n%s %d%n%s %d", "L¡a calificación más baja en el libro de calificaciones es: ", obtenerMinima(), "La calificación más alta en el libro de calificaciones es: ", obtenerMaxima());

        System.out.println("");

        imprimirGraficoBarras();
    }

    public int obtenerMinima() {
        int califBaja = calificaciones[0][0];

        for(int[] calificacionEstudiante : calificaciones) {

            for(int calificacion : calificacionEstudiante) {
                if(calificacion < califBaja) {
                    califBaja = calificacion;
                }
            }
        }

        return califBaja;
    }

    public int obtenerMaxima() {
        int califAlta = calificaciones[0][0];

        for(int[] calificacionEstudiante : calificaciones) {

            for(int calificacion : calificacionEstudiante) {
                if(calificacion > califAlta) {
                    califAlta = calificacion;
                }
            }
        }

        return califAlta;
    }

    public void imprimirCalificaciones() {

        System.out.printf("Las calificaciones son: %n%n");
        System.out.print("             ");

        for(int prueba = 0; prueba < calificaciones[0].length; prueba++) {
            System.out.printf("Prueba %d ", prueba + 1);
        }

        System.out.println("Promedio");

        for(int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d", estudiante + 1);

            for(int prueba : calificaciones[estudiante]) {
                System.out.printf("%8d", prueba);
            }

            double promedio = obtenerPromedio(calificaciones[estudiante]);
            System.out.printf("%9.2f%n", promedio);
        }
    }

    private double obtenerPromedio(int[] conjuntoCalif) {
        int total = 0;

        for(int calificacion : conjuntoCalif) {
            total += calificacion;
        }

        return (double) total / conjuntoCalif.length;
    }

    private void imprimirGraficoBarras() {

        System.out.println("Distribución de calificaciones en general");

        int[] frecuencia = new int[11];

        for(int[] califEstudiantes : calificaciones) {
            for(int calificacion : califEstudiantes) {
                ++frecuencia[calificacion / 10];
            }
        }

        for(int cuenta = 0; cuenta < frecuencia.length; cuenta++) {

            if(cuenta == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);
            }

            for(int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}