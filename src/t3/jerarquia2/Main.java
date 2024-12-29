package t3.jerarquia2;

/**
 *
 * @author manuel
 */
public class Main {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(2, 2, 4, 4);
        Cuadrado c1 = new Cuadrado(5, 5, 5, 5);
        Trapezoide t1 = new Trapezoide(7.15, 7.15, 8, 13, 7);

        System.out.println("Objeto rectángulo\n" +r1.getLados()+ "\nÁrea: " +r1.area()+
                "\n\nObjeto cuadrado\n" +c1.getLados()+ "\nÁrea: " +c1.area()+
                "\n\nObjeto trapezoide\n" +t1.getLadosTrapecio()+ "\nÁrea: " +t1.area());
    }
}
