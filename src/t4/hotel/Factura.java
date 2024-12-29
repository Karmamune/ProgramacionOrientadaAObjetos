package t4.hotel;

/**
 *
 * @author Manuel
 */
public class Factura {
    
    protected String numero, nombre, rfc, direccion;
    protected double total;
    
    
    public Factura() {
        this("", "", "", "", 0);
    }
    
    public Factura(String num, String nom, String rfc, String dir, double tot) {
        setNumero(num);
        setNombre(nom);
        setRFC(rfc);
        setDireccion(dir);
        setTotal(tot);
    }
    
    protected void setNumero(String n) {
        numero = n;
    }
    protected String getNumero() {
        return numero;
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
    
    protected void setDireccion(String d) {
        direccion = d;
    }
    protected String getDireccion() {
        return direccion;
    }
    
    protected void setTotal(double t) {
        total = t;
    }
    protected double getTotal() {
        return total;
    }
}
