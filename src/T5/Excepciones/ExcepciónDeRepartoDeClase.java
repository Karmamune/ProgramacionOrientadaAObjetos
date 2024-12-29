package T5.Excepciones;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class ExcepciónDeRepartoDeClase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        String leer = entrada.next();
        
        Integer número = Integer.valueOf(leer);
        
        System.out.println("Número entero ingresado: " +número);
    }
}

