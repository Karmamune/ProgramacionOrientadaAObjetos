package T4.Hotel;

/**
 *
 * @author Manuel
 */
public class HDoble extends Habitación{

    protected int frigobar;
    
    public HDoble(int n, String es, String t, double p, int nc, int ns, int nb, int nl, int e, int f) {
        super(n, es, t, p, nc, ns, nb, nl, e);
        this.setFrigobar(f);
    }
    
    protected void setFrigobar(int f) {
        frigobar = f;
    }
    protected int getFrigobar() {
        return frigobar;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nFrigobar: " +this.getFrigobar();
    }
}
