package T5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Excepci�nDeDiscrepanciaDeEntrada {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean ciclo = true;
        
        do {
            try {
                System.out.print("Ingrese un n�mero entero: ");
                int leer = entrada.nextInt();
                System.out.println("N�mero entero ingresado: " +leer);
                ciclo = false;
            }
            catch (InputMismatchException e) {
                System.err.println(e);
                System.out.println("No ingres� un n�mero entero\n");
                entrada.nextLine();
            }
        }while(ciclo);
    }
}

