package t6.archivos.proyecto_jframe;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Manuel
 */
public class LeerArchivoDeTexto extends JFrame{

    private JTextArea areaSalida;
    private JScrollPane panelDespl;
    private Scanner entrada;
    
    public LeerArchivoDeTexto() throws FileNotFoundException {
        
        areaSalida = new JTextArea();
        
        panelDespl = new JScrollPane(areaSalida);
        
        add(panelDespl, BorderLayout.CENTER);
        
        setSize(400, 400);
        setVisible(true);
        
        leerArchivo();
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
    
    public void leerArchivo() throws FileNotFoundException {

        File nombre = obtenerArchivo();
        
        entrada = new Scanner(nombre);
        
        if(nombre.exists()) {
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
        else {
            JOptionPane.showMessageDialog(this, nombre + " no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
