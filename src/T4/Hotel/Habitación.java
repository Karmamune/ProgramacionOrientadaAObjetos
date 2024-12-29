package T4.Hotel;

/**
 *
 * @author Manuel
 */
public class Habitaci�n {

    protected String tipo, estatus;
    protected int n�mero, nCamas, nSillones, nBa�os, nL�mparas, escritorio;
    protected double precio;
    
    public Habitaci�n(int n, String es, String t, double p, int nc, int ns, int nb, int nl, int e) {
        this.setN�mero(n);
        this.setEstatus(es);
        this.setTipo(t);
        this.setPrecio(p);
        this.setNCamas(nc);
        this.setNSillones(ns);
        this.setNBa�os(nb);
        this.setNL�mparas(nl);
        this.setEscritorio(e);
    }

    protected void setEstatus(String es) {
        estatus = es;
    }
    protected String getEstatus() {
        return estatus;
    }
    
    protected void setN�mero(int n) {
        n�mero = n;
    }
    protected int getN�mero() {
        return n�mero;
    }
    
    protected String getTipo() {
        return tipo;
    }
    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    protected void setPrecio(double p) {
        precio = p;
    }
    protected double getPrecio() {
        return precio;
    }

    protected int getNCamas() {
        return nCamas;
    }
    protected void setNCamas(int nCamas) {
        this.nCamas = nCamas;
    }

    protected int getNSillones() {
        return nSillones;
    }
    protected void setNSillones(int nSillones) {
        this.nSillones = nSillones;
    }

    protected int getNBa�os() {
        return nBa�os;
    }
    protected void setNBa�os(int nBa�os) {
        this.nBa�os = nBa�os;
    }

    protected int getNL�mparas() {
        return nL�mparas;
    }
    protected void setNL�mparas(int nL�mparas) {
        this.nL�mparas = nL�mparas;
    }

    public int getEscritorio() {
        return escritorio;
    }
    public void setEscritorio(int escritorio) {
        this.escritorio = escritorio;
    }
    
//    @Override
//    public String toString() {
//        return  "Habitaci�n\nN�mero: " +this.getN�mero()+
//                "\nTipo: " +this.getTipo()+
//                "\nN�mero de camas: " +this.getNCamas()+
//                "\nN�mero de sillones: " +this.getNSillones()+
//                "\nN�mero de ba�os: " +this.getNBa�os()+
//                "\nN�mero de l�mparas: " +this.getNL�mparas()+
//                "\nEscritorio: " +this.getEscritorio();
//    }

    public String infoH() {
        return getN�mero()+ "\t\t" +getTipo()+ "\t" +getPrecio()+ "\t\t" +getEstatus(); 
    }
}
