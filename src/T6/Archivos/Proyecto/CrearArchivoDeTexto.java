package T6.Archivos.Proyecto;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 *
 * @author Manuel
 */
public class CrearArchivoDeTexto {
    
    private Formatter salida;
    
    public void abrirArchivo() {
        try {
            salida = new Formatter("archivo.txt");
        }
        catch(SecurityException e) {
            System.err.println("No tiene acceso de escritura a este archivo.");
            System.exit(1);
        }
        catch(FileNotFoundException e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }
    
    public void agregarContenido() {
        
        Texto contenido = new Texto();
        Scanner entrada = new Scanner(System.in);
        byte opc = 1;
        
        System.out.print("\nEscriba una linea de texto en el archivo\n> ");
        while(opc != 0) {
            try {
                contenido.setTexto(entrada.next());
                salida.format("%s\n", contenido.getTexto());
                
                System.out.print("\n¿Quiere agregar otra linea de texto? 1) Sí, 0) No\n> ");
                opc = entrada.nextByte();
                entrada.nextLine();
            }
            catch(FormatterClosedException e) {
                System.err.println("Error al escribir en el archivo.");
                return;
            }
            catch(NoSuchElementException e) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine();
            }
        }
    }
    
    public void cerrarArchivo() {
        if(salida != null)
            salida.close();
    }
}
