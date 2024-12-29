package t4.hotel;

/**
 *
 * @author manuel
 */
public class Habitacion {
    protected String tipo, estatus;
    protected int numero, nCamas, nSillones, nBaños, nLamparas, escritorio;
    protected double precio;
    
    public Habitacion(int n, String es, String t, double p, int nc, int ns, int nb, int nl, int e) {
        this.setNumero(n);
        this.setEstatus(es);
        this.setTipo(t);
        this.setPrecio(p);
        this.setNCamas(nc);
        this.setNSillones(ns);
        this.setNBaños(nb);
        this.setNLamparas(nl);
        this.setEscritorio(e);
    }

    protected void setEstatus(String es) {
        estatus = es;
    }
    protected String getEstatus() {
        return estatus;
    }
    
    protected void setNumero(int n) {
        numero = n;
    }
    protected int getNumero() {
        return numero;
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

    protected int getNBaños() {
        return nBaños;
    }
    protected void setNBaños(int nBaños) {
        this.nBaños = nBaños;
    }

    protected int getNLamparas() {
        return nLamparas;
    }
    protected void setNLamparas(int nLamparas) {
        this.nLamparas = nLamparas;
    }

    public int getEscritorio() {
        return escritorio;
    }
    public void setEscritorio(int escritorio) {
        this.escritorio = escritorio;
    }
    
//    @Override
//    public String toString() {
//        return  "Habitación\nNumero: " +this.getNumero()+
//                "\nTipo: " +this.getTipo()+
//                "\nNumero de camas: " +this.getNCamas()+
//                "\nNumero de sillones: " +this.getNSillones()+
//                "\nNumero de baños: " +this.getNBaños()+
//                "\nNumero de lamparas: " +this.getNLamparas()+
//                "\nEscritorio: " +this.getEscritorio();
//    }

    public String infoH() {
        return getNumero()+ "\t\t" +getTipo()+ "\t" +getPrecio()+ "\t\t" +getEstatus(); 
    }
}
