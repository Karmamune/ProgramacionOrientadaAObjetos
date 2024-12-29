package T6.Archivos.Proyecto;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Manuel
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean ciclo = true;
        
        System.out.print("Bienvenido al programa de manejo de archivos\n\n1) Abrir\n2) Crear\n3) Copiar\n0) Salir\n\nEliga una opción\n> ");
        do {
            try {
                byte opc = entrada.nextByte();
                switch (opc) {
                    case 1 -> {
                        LeerArchivoDeTexto archivo = new LeerArchivoDeTexto();
                        archivo.abrirArchivo();
                        archivo.leerContenido();
                        archivo.cerrarArchivo();
                    }
                    case 2 -> {
                        CrearArchivoDeTexto archivo = new CrearArchivoDeTexto();
                        archivo.abrirArchivo();
                        archivo.agregarContenido();
                        archivo.cerrarArchivo();
                    }
                    case 3 -> {
                        CopiarArchivoDeTexto archivo = new CopiarArchivoDeTexto();
                        archivo.abrirArchivo();
                        archivo.copiarContenido();
                        archivo.cerrarArchivo();
                    }
                    default -> {break;}
                }
                ciclo = false;
            }
            catch (InputMismatchException e) {
                System.out.println("No ha ingresado una opción válida");
            }
        }while(ciclo);
    }
}
