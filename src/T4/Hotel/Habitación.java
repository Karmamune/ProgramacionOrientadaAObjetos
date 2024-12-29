package T4.Hotel;

/**
 *
 * @author Manuel
 */
public class Habitación {

    protected String tipo, estatus;
    protected int número, nCamas, nSillones, nBaños, nLámparas, escritorio;
    protected double precio;
    
    public Habitación(int n, String es, String t, double p, int nc, int ns, int nb, int nl, int e) {
        this.setNúmero(n);
        this.setEstatus(es);
        this.setTipo(t);
        this.setPrecio(p);
        this.setNCamas(nc);
        this.setNSillones(ns);
        this.setNBaños(nb);
        this.setNLámparas(nl);
        this.setEscritorio(e);
    }

    protected void setEstatus(String es) {
        estatus = es;
    }
    protected String getEstatus() {
        return estatus;
    }
    
    protected void setNúmero(int n) {
        número = n;
    }
    protected int getNúmero() {
        return número;
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

    protected int getNLámparas() {
        return nLámparas;
    }
    protected void setNLámparas(int nLámparas) {
        this.nLámparas = nLámparas;
    }

    public int getEscritorio() {
        return escritorio;
    }
    public void setEscritorio(int escritorio) {
        this.escritorio = escritorio;
    }
    
//    @Override
//    public String toString() {
//        return  "Habitación\nNúmero: " +this.getNúmero()+
//                "\nTipo: " +this.getTipo()+
//                "\nNúmero de camas: " +this.getNCamas()+
//                "\nNúmero de sillones: " +this.getNSillones()+
//                "\nNúmero de baños: " +this.getNBaños()+
//                "\nNúmero de lámparas: " +this.getNLámparas()+
//                "\nEscritorio: " +this.getEscritorio();
//    }

    public String infoH() {
        return getNúmero()+ "\t\t" +getTipo()+ "\t" +getPrecio()+ "\t\t" +getEstatus(); 
    }
}
