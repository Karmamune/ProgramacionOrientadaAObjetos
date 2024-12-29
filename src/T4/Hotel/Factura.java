package T4.Hotel;

/**
 *
 * @author Manuel
 */
public class Factura {
    
    protected String n�mero, nombre, rfc, direcci�n;
    protected double total;
    
    
    public Factura() {
        this("", "", "", "", 0);
    }
    
    public Factura(String num, String nom, String rfc, String dir, double tot) {
        setN�mero(num);
        setNombre(nom);
        setRFC(rfc);
        setDirecci�n(dir);
        setTotal(tot);
    }
    
    protected void setN�mero(String n) {
        n�mero = n;
    }
    protected String getN�mero() {
        return n�mero;
    }
    
    protected void setNombre(String n) {
        nombre = n;
    }
    protected String getNombre() {
        return nombre;
    }
    
    protected void setRFC(String r) {
        rfc = r;
    }
    protected String getRFC() {
        return rfc;
    }
    
    protected void setDirecci�n(String d) {
        direcci�n = d;
    }
    protected String getDirecci�n() {
        return direcci�n;
    }
    
    protected void setTotal(double t) {
        total = t;
    }
    protected double getTotal() {
        return total;
    }
}
