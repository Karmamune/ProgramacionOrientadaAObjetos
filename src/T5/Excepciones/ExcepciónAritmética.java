package T5.Excepciones;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class ExcepciónAritmética {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean ciclo = true;
        
        do {
            System.out.print("Ingrese un numerador: ");
            int numerador = entrada.nextInt();

            System.out.print("Ingrese un denominador: ");
            int denominador = entrada.nextInt();

            try {
                int resultado = numerador / denominador;
                System.out.println("Resultado: " +resultado);
                ciclo = false;
            }
            catch (ArithmeticException e) {
                System.err.println(e);
                System.out.println("0 no es un denominador válido\n");
            }
        }while(ciclo);
    }
}

