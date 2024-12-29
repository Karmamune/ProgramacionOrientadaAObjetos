package t5.excepciones;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class ExcepcionDePunteroNulo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int A1[] = null;
        int A2[] = {5, 8, 10};
        boolean ciclo = true;
        byte opc = 0;
        
        do {
            try {
                System.out.println("¿A qué arreglo quiere acceder?\n1) A1\n2) A2");
                opc = entrada.nextByte();
                System.out.println();
                switch(opc) {
                    case 1 -> {
                        for(int i = 0; i < A1.length; i++)
                            System.out.println(A1[i]);
                    }
                    case 2 -> {
                        for(int i = 0; i < A2.length; i++)
                            System.out.println(A2[i]);
                    }
                    default -> {System.out.println("Intente de nuevo\n");}
                }
                ciclo = false;
            }
            catch (NullPointerException e) {
                System.err.println(e);
                System.out.println("El arreglo A" +opc+ " se encuentra vacío\n");
            }
        }while(ciclo);
    }
}
