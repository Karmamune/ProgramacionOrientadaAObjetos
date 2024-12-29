package t2.metodos.banco;

/**
 *
 * @author manuel
 */
public class Cuenta {
    private static double saldo;

    public double crearCuenta(double saldoInicial){
        saldo = saldoInicial;
        return saldo;
    }

    public double depositar(double cantidad){
        saldo = saldo + cantidad;
        return saldo;
    }

    public double obtenerSaldo(){
        return saldo;
    }
}
