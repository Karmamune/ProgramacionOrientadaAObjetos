package t3.herencia;

/**
 *
 * @author manuel
 */
public class Administrativo extends Personal {
    public String actividad;

    public Administrativo(String n, int e, String c, String[] h, String ne, double s, String a) {
        super(n, e, c, h, ne, s);
        this.setActividad(a);
        System.out.println("En la clase administrativo");
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    public String getActividad() {
        return actividad;
    }

    @Override
    public String toString() {
        String regresa = "";
        regresa = regresa = "Nombre\tEdad\tCURP\t\t\t\tHorario\t\t\tN.Empleado\tSueldo\t\t\tActividad\n";
        regresa += super.toString();
        regresa += this.getActividad();
        return regresa;
    }
}
