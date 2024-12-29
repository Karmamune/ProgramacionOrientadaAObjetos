package T4.Hotel;

/**
 *
 * @author Manuel
 */
public class Cliente {
    
    protected String número, nombre, RFC, dirección;
    
    public Cliente(String nu, String n, String RFC, String d) {
        this.setNúmero(nu);
        this.setNombre(n);
        this.setRFC(RFC);
        this.setDirección(d);
    }
    
    protected void setNúmero(String nu) {
        número = nu;
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
    
    protected void setRFC(String rfc) {
        RFC = rfc;
    }
    protected String getRFC() {
        return RFC;
    }
    
    protected void setDirección(String d) {
        dirección = d;
    }
    protected String getDirección() {
        return dirección;
    }
}
