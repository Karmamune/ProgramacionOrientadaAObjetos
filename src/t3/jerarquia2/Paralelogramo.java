package t3.jerarquia2;

/**
 *
 * @author manuel
 */
public class Paralelogramo extends Cuadrilatero implements Metodos {
    public Paralelogramo(double li, double ld, double ls, double lin) {
        super(li, ld, ls, lin);
    }

    @Override
    public double area() {
        double area = this.getLI() * this.getLIn();
        return area;
    }

    @Override
    public double perimetro() {
        return this.getLI() + this.getLIn() + this.getLD() + this.getLS();
    }
}
