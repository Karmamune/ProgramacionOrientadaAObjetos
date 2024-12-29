package t6.archivos.archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class ReadTextFile {
    private Scanner entrada;
    
    // enable user to open file
    public void abrirArchivo() {
        try {
            entrada = new Scanner (new File ("empleados.txt"));
        } // end try
        catch (FileNotFoundException fnfe) {
            System.err.println("Error: Apertura de archivos.");
            System.exit(1);
        } // end catch
    }
    
    public void leerRegistro() {
        
        //objeto a ser desplegado en la pantalla
        Empleado registro = new Empleado();
        
        System.out.printf("%s\t$s\t$s\n", "Nombre", "Num. empleado", "Sueldos$");
        
        try { //read records from file using Scanner object
            while (entrada.hasNext()) {
                registro.setNombre(entrada.next());
                registro.setNumEmpleado(entrada.nextInt());
                registro.setSueldo(entrada.nextFloat());
                
                //despliega el contenido del registro
                System.out.printf("%s\t%d\t\t%10.2f\n", registro.getNombre(), registro.getNumEmpleado(), registro.getSueldo());
            } //end while
        } //end try
        catch (NoSuchElementException nsee) {
            System.err.println("File improperly formed.");
            entrada.close();
            System.exit(1);
        } //end catch
        catch (IllegalStateException ise) {
            System.err.println("Error reading from file.");
            System.exit(1);
        } //end catch
    } //end method readRecords
    
    //close file and terminate application
    public void cerrarArchivo() {
        if (entrada != null)
            entrada.close(); //close file
    } //end method closeFile
} //end class ReadTextFile
