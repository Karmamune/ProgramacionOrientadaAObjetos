package t2.metodos.calificacion;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Metodos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x;

        System.out.println("Por favor ingrese la calificación (Rango del 0 al 10");
        x = entrada.nextInt();
        Calificacion calificación = new Calificacion();
        System.out.println(calificación.resultado(x));
    }
}
