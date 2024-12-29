package t2.metodos.calificacion;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x;

        System.out.println("Por favor ingrese la calificación (Rango del 0 al 10");
        x = entrada.nextInt();
        System.out.println(resultado(x));
    }
        public static String resultado(int cal){
            String res = "";
            switch (cal) {
                case 10 -> res = "Excelente";
                case 9 -> res = "Muy bien";
                case 8 -> res = "Normal";
                case 7 -> res = "Regular";
                case 6, 5, 4, 3, 2, 1, 0 -> res = "Reprobado";
                default -> res = "Calificación no valida, por favor ingrese un número del 0 al 10";
            }
            return res;
        }
}
