package t6.archivos.proyecto_jframe;

/**
 *
 * @author Manuel
 */
public class Texto {
    
    private String texto;
    
    public Texto() {
        texto = "";
    }
    
    public Texto(String t) {
        setTexto(t);
    }
    
    public void setTexto(String t) {
        texto = t;
    }
    
    public String getTexto() {
        return texto;
    }
}
