package t2.metodos.banco2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Banco {
    public static Scanner entrada = new Scanner(System.in);
    public static Random random = new Random();
    public static String nCuentaGlobal;
    public static int tamaño;
    public static int nc = 0;

    public void definirArreglo(){
        System.out.println("Ingrese el número de cuentas que quiere registrar");
        tamaño = entrada.nextInt();
        inicio();
    }

    public static Cuenta[] arreglo = new Cuenta[tamaño];

    public void inicio(){
        byte opc = 0;
        do{
            System.out.println("\nBienvenido al banco n\n\n¿Ya es cliente?\n1) No\n2) Sí\n\n0) Salir\n");
            opc = entrada.nextByte();
            menuPersona(opc);
        }while(opc != 0);
    }

    public void menuPersona(byte x){
        switch(x){
            case 1 -> menuUsuarioNuevo();
            case 2 -> menuCliente();
            default -> {break;}
        }
    }

    public void menuUsuarioNuevo(){
        byte opc = 0;
        do{
            System.out.println("¿Quiere crear una nueva cuenta?\n1) No\n2) Sí");
            opc = entrada.nextByte();
            if(opc == 1)
                crearCuenta();
        }while(opc != 0);
    }

    public void crearCuenta(){
        if(nc < tamaño) {
            int número;
            String nombre;
            double saldo = 0;

            System.out.println("Por favor ingrese su nombre");
            nombre = entrada.next();

            int aleatorio = random.nextInt(999999);
            if(aleatorio < 100000)
                aleatorio += 100000;
            número = aleatorio;

            if(nc == 0)
                saldo = 10000;
            if(nc == 1)
                saldo = 20000;
            if(nc == 2)
                saldo = 30000;
            if(nc >= 3){
                do {
                    System.out.println("Por favor ingrese el monto con el que quiere abrir la cuenta");
                    saldo = entrada.nextDouble();
                    if(saldo == 0)
                        System.out.println("Tiene que ingresar una cantidad mayor a 0");
                }while(saldo != 0);
            }

            Cuenta cta = new Cuenta(String.valueOf(número), nombre, saldo);
            arreglo[nc] = cta;
            nc++;

            System.out.println("Su cuenta ha sido creada con éxito");

        }else
            System.out.println("Se ha creado el número máximo de cuentas");
    }

    public void menuCliente(){

    }

    public void deposito(){

    }

    public void retiro(){

    }

    public void checarSaldo(int cuenta){
        System.out.println("Su saldo es de: " +arreglo[cuenta].saldo);
    }
}
