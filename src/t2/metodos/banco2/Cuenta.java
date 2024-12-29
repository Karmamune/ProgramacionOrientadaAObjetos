package t2.metodos.banco2;

/**
 *
 * @author manuel
 */
public class Cuenta {
    String númeroCuenta, nombreCuenta;
    double saldo;

    public Cuenta(String númeroCuenta, String nombreCuenta, double saldo){
        this.númeroCuenta = númeroCuenta;
        this.nombreCuenta = nombreCuenta;
        this.saldo = saldo;
    }

    public String toString(){
        return this.númeroCuenta +this.nombreCuenta +this.saldo;
    }
}
