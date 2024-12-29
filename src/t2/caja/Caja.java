package t2.caja;

/**
 *
 * @author Manuel
 */
public class Caja {
    public int ancho, largo, alto;

    public Caja() {
        ancho = 2;
        largo = 2;
        alto = 2;
    }

    public Caja(int a, int b, int c) {
        ancho = a;
        largo = b;
        alto = c;
    }

    int volumen() {
        return (ancho * largo * alto);
    }

    public void setAlto(int x){
        this.alto = x;
    }
    public void setAncho(int x) {
        this.ancho = x;
    }

    public void setLargo(int x) {
        this.largo = x;
    }

    @Override
    public String toString(){
        return "Alto: " +this.alto+ "\nAncho: " +this.ancho+ "\nLargo: " +this.largo;
    }
}
