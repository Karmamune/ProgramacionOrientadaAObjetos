package T4.Hotel;

/**
 *
 * @author Manuel
 */
public class HEspecial extends Habitación {

    protected int cocina, cuartos, sala;
    
    public HEspecial(int n, String es, String t, double p, int nc, int ns, int nb, int nl, int e, int c, int ncu, int s) {
        super(n, es, t, p, nc, ns, nb, nl, e);
        this.setCocina(c);
        this.setNCuartos(ncu);
        this.setSala(s);
    }
    
    protected void setCocina(int c) {
        cocina = c;
    }
    protected int getCocina() {
        return cocina;
    }
    
    protected void setNCuartos(int ncu) {
        cuartos = ncu;
    }
    protected int getNCuartos() {
        return cuartos;
    }
    
    protected void setSala(int s) {
        sala = s;
    }
    protected int getSala() {
        return sala;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "\nFrigobar: " +this.getCocina()+ "\nCuartos: " +this.getNCuartos();
    }
}
