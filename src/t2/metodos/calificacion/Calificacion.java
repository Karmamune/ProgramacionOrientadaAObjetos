package t2.metodos.calificacion;

/**
 *
 * @author manuel
 */
public class Calificacion {
    public String resultado(int cal){
        String res = "";
        switch (cal) {
            case 10 -> res = "Excelente";
            case 9 -> res = "Muy bien";
            case 8 -> res = "Normal";
            case 7 -> res = "Regular";
            case 6, 5, 4, 3, 2, 1, 0 -> res = "Reprobado";
            default -> res = "Calificación no valida, por favor ingrese un número del 0 al 10";
        }
        return res;
    }
}
