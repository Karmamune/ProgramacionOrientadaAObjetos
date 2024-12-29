package t6.archivos.proyecto_jframe;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Manuel
 */
public class CopiarArchivoDeTexto extends JFrame{
    
    private Formatter salida;
    private Scanner entrada;
    
    private JTextArea areaSalida;
    private JScrollPane panelDespl;
    
    public CopiarArchivoDeTexto() throws FileNotFoundException {
        
        areaSalida = new JTextArea();
        
        panelDespl = new JScrollPane(areaSalida);
        
        add(panelDespl, BorderLayout.CENTER);
        
        setSize(400, 400);
        setVisible(true);
        
        abrirArchivo();
        copiar();
    }
    
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
    }
    
    private File obtenerArchivo() {
        
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        int resultado = selectorArchivos.showOpenDialog(this);
        
        if(resultado == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        
        File nombreArchivo = selectorArchivos.getSelectedFile();
        
        if((nombreArchivo == null) || (nombreArchivo.getName().equals(""))) {
            JOptionPane.showMessageDialog(this, "Nombre de archivo inválido",
                    "Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
        return nombreArchivo;
    }
    
    public void copiar() throws FileNotFoundException {

        File nombre = obtenerArchivo();
        
        entrada = new Scanner(nombre);
        
        if(nombre.exists()) {
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
            finally {
                if (entrada != null) {
                    entrada.close();
                }

                if (salida != null) {
                    salida.close();
                }
            }
            
        }
        else {
            JOptionPane.showMessageDialog(this, nombre + " no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
