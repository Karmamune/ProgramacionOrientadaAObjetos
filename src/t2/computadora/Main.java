package t2.computadora;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);
        System.out.println("\nPor favor ingrese los componentes para armar una computadora en el siguiente orden:\nNombre del gabinete\nPlaca madre\nProcesador\nGráfica\nTipo de almacenamiento\nAlmacenamiento en GB\nMódulos de ram\nRam por módulo\n");
        Computadora comp = new Computadora(entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.nextInt(), entrada.nextInt(), entrada.nextInt());
        System.out.println("\nLos componentes que ha seleccionado para su computadora son\n" +comp.toString());
    }
}
