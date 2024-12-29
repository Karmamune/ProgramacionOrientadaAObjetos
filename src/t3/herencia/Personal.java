package t3.herencia;

/**
 *
 * @author manuel
 */
public class Personal extends Persona {
    public String nEmpleado;
    private double sueldo;

    public Personal(String n, int e, String c, String[] h, String ne, double s) {
        super(n, e, c, h);
        this.setNEmpleado(ne);
        this.setSueldo(s);
        System.out.println("En la clase personal");
    }

    public void setNEmpleado(String nEmpleado) {
        this.nEmpleado = nEmpleado;
    }
    public String getNEmpleado() {
        return nEmpleado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        String regresa = "";
        regresa = super.toString();
        regresa += this.getNEmpleado() + "\t\t" + this.getSueldo() + " MXN\t\t";
        return regresa;
    }
}
