package T5.Excepciones;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Excepci�nDeRepartoDeClase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un n�mero entero: ");
        String leer = entrada.next();
        
        Integer n�mero = Integer.valueOf(leer);
        
        System.out.println("N�mero entero ingresado: " +n�mero);
    }
}

