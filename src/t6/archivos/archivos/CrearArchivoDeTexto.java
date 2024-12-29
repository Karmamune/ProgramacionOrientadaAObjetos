package t6.archivos.archivos;

import java.io.FileNotFoundException;
import java.io.IOException;
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
    
    public void AbrirArchivo() throws IOException {
        try {
            salida = new Formatter("empleados.txt");
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
    
    public void AgregarRegistros() {
        Empleado registro = new Empleado();
        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s\n%s", "Escribe el nombre, número de empleado y sueldo ","? ");
        
        try {
            registro.setNombre(entrada.next());
            registro.setNumEmpleado(entrada.nextInt());
            registro.setSueldo(entrada.nextFloat());
            salida.format("%s %d %.2f\n", registro.getNombre(), registro.getNumEmpleado(), registro.getSueldo());
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
}
