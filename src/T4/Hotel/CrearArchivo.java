package T4.Hotel;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

/**
 *
 * @author Manuel
 */
public class CrearArchivo {
    private Formatter salida;
    
    public void crearArchivo() {
        try {
            salida = new Formatter("clientes.txt");
        }
        catch (FileNotFoundException fnfe) {
            System.err.println("Error: No se puede crear/abrir el archivo");
            System.exit(1);
        }
        catch (SecurityException se) {
            System.err.println("Error: No tiene acceso de escritura al archivo");
            System.exit(1);
        }
    }
    
    public void iniciarArchivo() {
        try {

            salida.format("%s\t\t%s\t\t%s\t\t%s\t\t%s%n", "Número", "Nombre", "RFC", "Dirección", "Total");
        }
        catch (FormatterClosedException fce) {
            System.err.println("Error al escribir en el archivo");
            return;
        }
        catch (NoSuchElementException ee) {
            System.err.println("Entrada inválida, cerrando archivo \n" +ee);
            return;
        }
    }
    
    public void cerrarArchivo() {
        if(salida != null)
            salida.close();
    }
    
    public static void main(String[] args) {
        CrearArchivo c = new CrearArchivo();
        
        c.crearArchivo();
        c.iniciarArchivo();
        c.cerrarArchivo();
    }
}
