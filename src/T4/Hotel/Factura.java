package T4.Hotel;

/**
 *
 * @author Manuel
 */
public class Factura {
    
    protected String número, nombre, rfc, dirección;
    protected double total;
    
    
    public Factura() {
        this("", "", "", "", 0);
    }
    
    public Factura(String num, String nom, String rfc, String dir, double tot) {
        setNúmero(num);
        setNombre(nom);
        setRFC(rfc);
        setDirección(dir);
        setTotal(tot);
    }
    
    protected void setNúmero(String n) {
        número = n;
    }
    protected String getNúmero() {
        return número;
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
    
    protected void setDirección(String d) {
        dirección = d;
    }
    protected String getDirección() {
        return dirección;
    }
    
    protected void setTotal(double t) {
        total = t;
    }
    protected double getTotal() {
        return total;
    }
}
