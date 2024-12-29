package T6.Archivos.Proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class LeerArchivoDeTexto {
    
    private Scanner entrada;
    
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("archivo.txt"));
        }
        catch(FileNotFoundException e) {
            System.err.println("No se ha encontrado el archivo: \"archivo.txt\"");
            System.exit(1);
        }
    }
    
    public void leerContenido() {
        Texto contenido = new Texto();
            
        System.out.println("\nContenido del archivo: \"archivo.txt\"");
        try {
            while(entrada.hasNext()) {
                contenido.setTexto(entrada.next());
                System.out.println(contenido.getTexto());
            }
        }
        catch(NoSuchElementException e) {
            System.err.println("El archivo no está bien formado.");
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
