package t6.archivos.archivos;

/**
 *
 * @author Manuel
 */
public class ReadTextFileTest {
    public static void main (String[] args) {
        ReadTextFile rtf = new ReadTextFile();
        rtf.abrirArchivo();
        rtf.leerRegistro();
        rtf.cerrarArchivo();
    } //end main
} //end class ReadTextFileTest
