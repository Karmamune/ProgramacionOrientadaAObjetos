package t2.metodos.clases3;

/**
 *
 * @author manuel
 */
public class Main {
    public static void main(String[] args){

        Calculadora c1 = new Calculadora("Casio", "fx-115es plus", 400);
        Reloj r1 = new Reloj("Casio", "Negro", "Digital", 250);
        Audifonos a1 = new Audifonos("Sony", "Diadema", "Bluetooth", "Azul", 1000);

        System.out.println(c1+ "\n\n" +r1+ "\n\n" +a1);
    }
}
