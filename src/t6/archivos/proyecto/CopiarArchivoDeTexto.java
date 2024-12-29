package t6.archivos.proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class CopiarArchivoDeTexto {
    
    private Formatter salida;
    private Scanner entrada;
    
    public void abrirArchivo() {
        try {
            salida = new Formatter("archivo - copia.txt");
        }
        catch(SecurityException e) {
            System.err.println("No tiene acceso de escritura a este archivo.");
            System.exit(1);
        }
        catch(FileNotFoundException e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
        
        try {
            entrada = new Scanner(new File("archivo.txt"));
        }
        catch(FileNotFoundException e) {
            System.err.println("No se ha encontrado el archivo: \"archivo.txt\"");
            System.exit(1);
        }
    }
    
    public void copiarContenido() {
        
        Texto contenido = new Texto();
        
        try {
            while(entrada.hasNext()) {
                contenido.setTexto(entrada.next());
                salida.format("%s\n", contenido.getTexto());
            }
        }
        catch(FormatterClosedException e) {
            System.err.println("Error al escribir en la copia del archivo.");
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
        if(salida != null)
            salida.close();
    }
}
