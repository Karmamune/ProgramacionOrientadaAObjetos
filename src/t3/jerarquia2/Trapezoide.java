package t3.jerarquia2;

/**
 *
 * @author manuel
 */
public class Trapezoide extends Cuadrilatero implements Metodos {
    double altura;
    public Trapezoide(double li, double ld, double ls, double lin, double h) {
        super(li, ld, ls, lin);
        altura = h;
    }

    protected void setAltura(double h) {
        altura = h;
    }
    protected double getAltura() {
        return altura;
    }

    @Override
    public double area() {
        double áreaTrapecio;
        áreaTrapecio = (this.getLS() + this.getLIn()) * this.getAltura() / 2;
        return áreaTrapecio;
    }

    @Override
    public double perimetro() {
        return this.getLI() + this.getLIn() + this.getLD() + this.getLS();
    }

    protected String getLadosTrapecio(){
        return "Lado izquierdo: " +this.getLI()+ "\nLado derecho: " +this.getLD()+
                "\nLado superior: " +this.getLS()+ "\nLado inferior: " +this.getLIn()+ "\nAltura: " +this.getAltura();
    }
}
