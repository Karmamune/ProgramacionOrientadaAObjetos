package T4.Hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class LeerArchivo {
    private Scanner entrada;
    
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("clientes.txt"));
        }
        catch(FileNotFoundException e) {
            System.err.println("No se ha encontrado el archivo: \"archivo.txt\"");
            System.exit(1);
        }
    }
    
    public void leerContenido() {
        Factura f = new Factura();
            
        System.out.println("\nArchivo de clientes:\n\nN�mero\t\tNombre\t\tRFC\t\tDirecci�n\t\tTotal");
        try {
            while(entrada.hasNext()) {
                f.setN�mero(entrada.next());
                f.setNombre(entrada.next());
                f.setRFC(entrada.next());
                f.setDirecci�n(entrada.next());
                f.setTotal(entrada.nextDouble());
                
                System.out.printf("%s\t%s\t\t%s\t\t%s\t\t\t%.2f%n", f.getN�mero(), f.getNombre(), f.getRFC(), f.getDirecci�n(), f.getTotal());
            }
        }
        catch(NoSuchElementException e) {
            System.err.println("El archivo no est� bien formado.");
            entrada.close();
            System.exit(1);
        }
        catch(IllegalStateException e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }
    
    public void cerrarArchivo() {
        if(entrada != null)
            entrada.close();
    }
}
