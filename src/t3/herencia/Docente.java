package t3.herencia;

/**
 *
 * @author manuel
 */
public class Docente extends Personal {
    public int residentes, tutorados;

    public Docente(String n, int e, String c, String[] h, String ne, double s, int r, int t) {
        super(n, e, c, h, ne, s);
        this.setResidentes(r);
        this.setTutorados(t);
        System.out.println("En la clase docente");
    }

    public void setResidentes(int residentes) {
        this.residentes = residentes;
    }
    public int getResidentes() {
        return residentes;
    }

    public void setTutorados(int tutorados) {
        this.tutorados = tutorados;
    }
    public int getTutorados() {
        return tutorados;
    }

    @Override
    public String toString() {
        String regresa = "";
        regresa = regresa = "Nombre\tEdad\tCURP\t\t\t\tHorario\t\t\tN.Empleado\tSueldo\t\t\tResidentes\tTutorados\n";
        regresa += super.toString();
        regresa += this.getResidentes() + "\t\t\t" + this.getTutorados();
        return regresa;
    }
}
