package t4.hotel;

/**
 *
 * @author Manuel
 */
public class Cliente {
    
    protected String numero, nombre, RFC, direccion;
    
    public Cliente(String nu, String n, String RFC, String d) {
        this.setNumero(nu);
        this.setNombre(n);
        this.setRFC(RFC);
        this.setDireccion(d);
    }
    
    protected void setNumero(String nu) {
        numero = nu;
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
    
    protected void setRFC(String rfc) {
        RFC = rfc;
    }
    protected String getRFC() {
        return RFC;
    }
    
    protected void setDireccion(String d) {
        direccion = d;
    }
    protected String getDireccion() {
        return direccion;
    }
}
