package t2.metodos.sobrecargados;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Calificaciones {
    public Scanner entrada = new Scanner(System.in);

    public void Scanner(){
        System.out.println("1) Int\n2) float\n");
        int opc = entrada.nextInt();
        if(opc == 1){
            System.out.println("¿Cuántos números tiene? (1 o 3)");
            int canNúm = entrada.nextInt();
            switch(canNúm){
                case 1 -> {
                    System.out.println("Ingrese el número (int)");
                    calificación(entrada.nextInt());
                }
                case 3 -> {
                    System.out.println("Ingrese los 3 números (int)");
                    calificación(entrada.nextInt(), entrada.nextInt(), entrada.nextInt());
                }
                default -> {break;}
            }
        }else{
            System.out.println("Ingrese 3 floats (float)");
            calificación(entrada.nextFloat(), entrada.nextFloat(), entrada.nextFloat());
        }

    }

    public String calificación(int c){
        switch(c){
            case 0, 1, 2, 3, 4, 5, 6 -> {
                System.out.println("Reprobado");
            }
            case 7 -> {
                System.out.println("Regular");}
            case 8 -> {
                System.out.println("Bien");}
            case 9 -> {
                System.out.println("Muy bien");}
            case 10 -> {
                System.out.println("Excelente");}
            default -> {break;}
        }
        return "";
    }

    public boolean calificación(int a, int b, int c){
        double d = (a + b + c) / 3;
        if(d > 7)
            return true;
        else
            return false;
    }

    public void calificación(float a, float b, float c){
        int promedio = Math.round((a + b + c) / 3);
        int vecInt[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String vecStr[] = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
        for(int i = 0; i < vecInt.length; i++){
            if(vecInt[i] == promedio){
                System.out.println(vecStr[i]);
            }
        }
    }
}
