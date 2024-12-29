package t2.metodos.banco3;

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

    public String abonar(double x){
        saldo = saldo + x;
        return "Su saldo nuevo es: " +saldo;
    }

    public String retirar(double y){
        saldo = saldo - y;
        return "Su saldo nuevo es: " +saldo;
    }

    public String checarSaldo(){
        return "Su saldo es: " +saldo;
    }

    public String toString(){
        return this.númeroCuenta +this.nombreCuenta +this.saldo;
    }
}
