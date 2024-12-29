package T6.Archivos.Archivos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class DemoCrearArchivo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int oper;
        CrearArchivoDeTexto archivo = new CrearArchivoDeTexto();
        
        archivo.AbrirArchivo();
        do {
            archivo.AgregarRegistros();
            System.out.println("Teclea 1 para ingresar otro registro, Teclea 2 para salir");
            oper = scanner.nextInt();
        }while (oper != 2);
        
        archivo.cerrarArchivo();
    }
}
