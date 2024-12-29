package T5.Excepciones;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Excepci�nDe�ndiceDeMatrizFueraDeL�mites {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = {1, 2, 3};
        boolean ciclo = true;
        
        do {
            try {
                System.out.print("Ingrese el n�mero de la posici�n"
                    + "del arreglo que quiera ver: ");
                int �ndice = entrada.nextInt();
                System.out.println(arreglo[�ndice]);
                ciclo = false;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.err.println(e);
                System.out.println("El n�mero que ingres� sobrepasa"
                        + "el l�mite del arreglo\n");
            }
        }while(ciclo);
    }
}
