package T4.Hotel;

/**
 *
 * @author Manuel
 */
public class Cliente {
    
    protected String n�mero, nombre, RFC, direcci�n;
    
    public Cliente(String nu, String n, String RFC, String d) {
        this.setN�mero(nu);
        this.setNombre(n);
        this.setRFC(RFC);
        this.setDirecci�n(d);
    }
    
    protected void setN�mero(String nu) {
        n�mero = nu;
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
    
    protected void setRFC(String rfc) {
        RFC = rfc;
    }
    protected String getRFC() {
        return RFC;
    }
    
    protected void setDirecci�n(String d) {
        direcci�n = d;
    }
    protected String getDirecci�n() {
        return direcci�n;
    }
}
