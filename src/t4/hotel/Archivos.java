package t4.hotel;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

/**
 *
 * @author Manuel
 */
public class Archivos {
    
    private Formatter salida;
    
    public void abrirArchivo() {
        try {
            salida = new Formatter(new FileWriter("clientes.txt", true));
        }
        catch(FileNotFoundException e) {
            System.err.println("No se puede abrir el archivo.");
            System.exit(1);
        }
        catch(IOException e) {
            System.err.println("No se puede abrir el archivo.");
            System.exit(1);
        }
    }
    
    public void agregarClientes(String num, String nom, String rfc, String dir, double tot) {
        salida.format("%s\t%s\t\t%s\t\t%s\t\t\t%.2f%n", num, nom, rfc, dir, tot);
    }
    
    public void cerrarArchivo() {
        if(salida != null)
            salida.close();
    }
}
