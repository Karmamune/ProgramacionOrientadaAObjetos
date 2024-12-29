package t2.caja;

/**
 *
 * @author manuel
 */
public class Main {
    public static void main(String[] args){
            Caja cubo = new Caja();
            Caja rect = new Caja(3, 6, 2);
            Caja caja3 = new Caja();
            caja3.alto = 3;
            caja3.ancho = 3;
            caja3.largo = 3;
            System.out.println("\nDatos del cubo\n" +cubo.toString());
            System.out.println("\nDatos del rectángulo\n" +rect.toString());
            System.out.println("\nDatos de la caja3\n" +caja3.toString());
    }
}
