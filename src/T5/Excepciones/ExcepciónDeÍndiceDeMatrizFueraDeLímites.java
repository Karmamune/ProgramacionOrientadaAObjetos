package T5.Excepciones;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class ExcepciónDeÍndiceDeMatrizFueraDeLímites {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = {1, 2, 3};
        boolean ciclo = true;
        
        do {
            try {
                System.out.print("Ingrese el número de la posición"
                    + "del arreglo que quiera ver: ");
                int índice = entrada.nextInt();
                System.out.println(arreglo[índice]);
                ciclo = false;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.err.println(e);
                System.out.println("El número que ingresó sobrepasa"
                        + "el límite del arreglo\n");
            }
        }while(ciclo);
    }
}
