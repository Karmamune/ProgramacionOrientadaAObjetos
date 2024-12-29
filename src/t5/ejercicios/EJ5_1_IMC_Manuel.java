package t5.ejercicios;

/*
crear un programa que permita calcular la masa corporal solicitando los siguientes datos
-nombre
-edad
-peso
-estatura

IMC = peso / estatura^{2}
*/

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Manuel
 */
public class EJ5_1_IMC_Manuel {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean ciclo = true;
        String nombre = "", inter = "";
        char sexo = 'X';
        int edad = 0;
        double peso = 0, estatura = 0, IMC = 0;
        
        System.out.println("""
                           Bienvenido
                           Este programa te ayudará a calcular su índice de masa corporal
                           
                           Notas:
                           -Sexo se ingresa como H para Hombre o M para Mujer
                           -Puntos decimales para peso y estatura (ejemplo
                            peso: 65.4, estatura: 1.80)
                           
                           (por favor considere que si ingresa un dato erróneo tendrá que
                           volver a ingresar todo)
                           """);
        do {
            try {
                System.out.print("Ingrese su nombre: ");
                nombre = entrada.next();
                System.out.print("Ingrese su sexo: ");
                sexo = entrada.next().charAt(0);
                System.out.print("Ingrese su edad: ");
                edad = entrada.nextInt();
                if (edad == 0)
                    throw new Exception("No puede ingresar una edad de 0, vuelva a intentarlo\n");
                
                System.out.print("Ingrese su peso: ");
                peso = entrada.nextDouble();
                if (peso == 0)
                    throw new Exception("No puede ingresar un peso de 0, vuelva a intentarlo\n");
                
                System.out.print("Ingrese su estatura: ");
                estatura = entrada.nextDouble();
                if (estatura == 0)
                    throw new Exception("No puede ingresar una estatura de 0, vuelva a intentarlo\n");
                
                IMC = peso / (estatura * estatura);
                
                if (sexo == 'H' || sexo == 'h') {
                    if (IMC < 20)
                        inter = "Bajo peso";
                    if (IMC >= 20 && IMC <= 24.9)
                        inter = "Normal";
                    if (IMC >= 25 && IMC <= 29.9)
                        inter = "Obesidad leve";
                    if (IMC >= 30 && IMC <= 40)
                        inter = "Obesidad severa";
                    if (IMC > 40)
                        inter = "Obesidad muy severa";
                }else if (sexo == 'M' || sexo == 'm') {
                    if (IMC < 20)
                        inter = "Bajo peso";
                    if (IMC >= 20 && IMC <= 23.9)
                        inter = "Normal";
                    if (IMC >= 24 && IMC <= 28.9)
                        inter = "Obesidad leve";
                    if (IMC >= 29 && IMC <= 37)
                        inter = "Obesidad severa";
                    if (IMC > 37)
                        inter = "Obesidad muy severa";
                }else
                    throw new Exception("El sexo que ingresó no es válido, vuelva a intentarlo\n");
                
                ciclo = false;
            }
            catch (InputMismatchException e) {
                System.out.println("Ha ingresado un dato erróneo, por favor vuelva a intentarlo\n");
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }while(ciclo);
        
        System.out.println("\n===================================");
        System.out.println("\nDatos\nNombre: " +nombre+ "\nSexo: " +sexo+ "\nEdad: " +edad+ "\nPeso: " +peso+ "\nEstatura: " +estatura);
        System.out.println("\nIMC\tInterpretación");
        System.out.printf("%.2f\t %s\n", IMC, inter);
        System.out.println("\n===================================");
    }
}
