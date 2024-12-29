package t3.jerarquia2;

/**
 *
 * @author manuel
 */
public class Cuadrilatero {
    protected double li, ld, ls, lin;
    /*
    li = lado izquierdo
    ld = lado derecho
    ls = lado superior
    lin = lado inferior
     */

    public Cuadrilatero(double li, double ld, double ls, double lin) {
        this.setLI(li);
        this.setLD(ld);
        this.setLS(ls);
        this.setLIn(lin);
    }

    protected void setLI(double li) {
        this.li = li;
    }
    protected double getLI() {
        return li;
    }

    protected void setLD(double ld) {
        this.ld = ld;
    }
    protected double getLD() {
        return ld;
    }

    protected void setLS(double ls) {
        this.ls = ls;
    }
    protected double getLS() {
        return ls;
    }

    protected void setLIn(double lin) {
        this.lin = lin;
    }
    protected double getLIn() {
        return lin;
    }

    protected String getLados(){
        return "Lado izquierdo: " +li+ "\nLado derecho: " +ld+ "\nLado superior: " +ls+ "\nLado inferior: " +lin;
    }
}
