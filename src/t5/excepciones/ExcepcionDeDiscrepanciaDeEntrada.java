package t5.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class ExcepcionDeDiscrepanciaDeEntrada {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean ciclo = true;
        
        do {
            try {
                System.out.print("Ingrese un número entero: ");
                int leer = entrada.nextInt();
                System.out.println("Número entero ingresado: " +leer);
                ciclo = false;
            }
            catch (InputMismatchException e) {
                System.err.println(e);
                System.out.println("No ingresó un número entero\n");
                entrada.nextLine();
            }
        }while(ciclo);
    }
}
