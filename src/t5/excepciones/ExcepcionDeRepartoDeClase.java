package t5.excepciones;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class ExcepcionDeRepartoDeClase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        String leer = entrada.next();
        
        Integer numero = Integer.valueOf(leer);
        
        System.out.println("Numero entero ingresado: " +numero);
    }
}
