package t3.clase_base_y_extendida;

/**
 *
 * @author manuel
 */
public class Main {
    public static void main(String[] args) {
        Gato g1 = new Gato(4, 2, "Siamés");
        Perro p1 = new Perro(4, 2, "Pastor Alemán");
        Loro l1 = new Loro(2, 2, "Kae", "Verdes");

        System.out.println("Objeto gato\n" +g1.habla()+ "\n\nObjeto perro\n" +p1.habla()+ "\n\nObjeto loro\n" +l1.habla());
    }
}
