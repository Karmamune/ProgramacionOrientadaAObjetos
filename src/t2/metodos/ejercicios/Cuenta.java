package t2.metodos.ejercicios;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Cuenta {
    private double saldo;
    public Cliente cliente;
    private static int nCuentas = 0;
    Scanner entrada = new Scanner(System.in);

    public void inicio(){
        System.out.println("Ingrese el saldo para crear cuenta");
        this.cuenta(entrada.nextDouble());
    }


    public void cuenta(double saldo){
        this.setSaldo(saldo);
        nCuentas++;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getnCuentas(){
        return this.nCuentas;
    }
}
