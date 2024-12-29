package t2.caja2;

/**
 *
 * @author manuel
 */
public class Caja {
    public static void main(String[] args) {
        t2.caja.Caja cubo = new t2.caja.Caja();
        t2.caja.Caja rect = new t2.caja.Caja(3, 6, 2);
        t2.caja.Caja caja3 = new t2.caja.Caja();
        caja3.setAncho(3);
        caja3.setLargo(3);
        caja3.setAlto(3);
        System.out.println("\nDatos del cubo\n" + cubo.toString());
        System.out.println("\nDatos del rectángulo\n" + rect.toString());
        System.out.println("\nDatos de la caja3\n" + caja3.toString());
    }
}
