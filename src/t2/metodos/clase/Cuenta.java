package t2.metodos.clase;

/**
 *
 * @author manuel
 */
public class Cuenta {
    private static double saldo;
    public static Cliente cliente;
    public static int nCuentas = 0;

    public Cuenta(double saldo, Cliente cliente){
        this.saldo = saldo;
        this.cliente = cliente;
        this.nCuentas++;
    }

    public static void deposito(double cantidad){
        saldo += cantidad;
    }

    public static void retiro(double cantidad){
        saldo -= cantidad;
    }

    public static double getSaldo(){
        return saldo;
    }

    public static int getNCuentas(){
        return nCuentas;
    }

    @Override
    public String toString() {
        return "Cliente\n" +cliente+ "\nSaldo: " +saldo+ " MXN";
    }
}
