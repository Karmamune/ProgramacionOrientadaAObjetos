package t2.metodos.clase;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        datos();
    }

    public static void datos() {

        byte repetir = 0;
        do {
            String nom, rfc;
            double saldo;
            Cliente c1;
            Cuenta cta;

            System.out.println("\nProporcione los datos del cliente nombre y RFC");
            nom = entrada.next();
            rfc = entrada.next();
            c1 = new Cliente(nom, rfc);

            System.out.println("\nProporciona datos de cuenta saldo");
            saldo = entrada.nextDouble();
            cta = new Cuenta(saldo, c1);

            byte opc = 0;
            do {
                System.out.println("\nMenú operaciones\n1) Mostrar número de cuentas creadas\n2) Mostrar datos de la cuenta\n3) Depositar\n4) Retirar\n0) Salir");
                opc = entrada.nextByte();
                switch (opc) {
                    case 1 -> System.out.println("\nEl número de cuentas que han sido creadas es: " +Cuenta.getNCuentas());
                    case 2 -> {
                        System.out.println("\n" + cta);
                    }
                    case 3 -> {
                        System.out.println("\nIngrese la cantidad que quiere depositar");
                        double cantidad = entrada.nextDouble();
                        if (cantidad > 0) {
                            Cuenta.deposito(cantidad);
                        } else
                            System.out.println("\nNo puede depositar la cantidad de 0");
                    }
                    case 4 -> {
                        System.out.println("\nIngrese la cantidad que quiere retirar");
                        double cantidad = entrada.nextDouble();
                        if (cantidad > 0 && Cuenta.getSaldo() >= cantidad) {
                            Cuenta.retiro(cantidad);
                        } else
                            System.out.println("\nPor favor ingrese una cantidad mayor a 0 y menor al total saldo que tiene");
                    }
                    default -> {
                        break;
                    }
                }
            } while (opc != 0);

            System.out.println("\n¿Quiere crear otra cuenta?\n1) Sí\n0) No");
            repetir = entrada.nextByte();
        }while(repetir != 0);
    }
}
