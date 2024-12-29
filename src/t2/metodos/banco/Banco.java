package t2.metodos.banco;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Banco {
    public static Scanner entrada = new Scanner(System.in);
    Cuenta c1 = new Cuenta();

    public void inicio(){
        byte opc = 0;
        do{
            System.out.println("\nBienvenido al banco x\n\n¿Ya es cliente?\n\n1) No\n2) Sí\n\n0) Salir\n");
            opc = entrada.nextByte();
            menuPersona(opc);
        }while(opc != 0);
    }

    public void menuPersona(byte n){
        switch(n){
            case 1 -> menuNuevoUsuario();
            case 2 -> menuCliente();
            default -> {break;}
        }
    }

    public void menuNuevoUsuario(){
        byte opc = 0;
        do {
            System.out.println("\n¿Quiere crear una cuenta?\n\n0) No\n1) Sí\n");
            opc = entrada.nextByte();
            if (opc == 1){
                System.out.println("\nIngrese la cantidad que quiere depositar:");
                double depositoNuevaCuenta = entrada.nextDouble();
                c1.crearCuenta(depositoNuevaCuenta);
                System.out.println("\nSu cuenta ha sido creada con éxito");
                opc = 0;
            }
        }while(opc != 0);
    }
    public void menuCliente(){
        byte opc = 0;
        double checandoSaldo = c1.obtenerSaldo();
        if(checandoSaldo == 0)
            System.out.println("\nNinguna cuenta ha sido creada");
        else {
            do {
                System.out.println("\n¿Qué desea realizar?\n\n1) Depositar\n2) Checar saldo\n\n0) Salir\n");
                opc = entrada.nextByte();
                switch (opc) {
                    case 1:
                        opcDepositar();
                    case 2:
                        checarSaldo();
                    default:
                        break;
                }
            } while (opc != 0);
        }
    }

    public void opcDepositar(){
        System.out.println("\n¿Cuanto dinero quiere depositar");
        double depoSaldo = entrada.nextDouble();
        do {
            if (depoSaldo > 0)
                c1.depositar(depoSaldo);
            else
                System.out.println("\nPor favor ingrese una cantidad mayor a 0");
        }while(depoSaldo == 0);
    }

    public void checarSaldo(){
        System.out.println("\nSu saldo es de: " +c1.obtenerSaldo()+ " MXN");
    }
}
