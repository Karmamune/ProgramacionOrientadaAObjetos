package t3.herencia;

/**
 *
 * @author manuel
 */
public class Alumno extends Persona {
    public String nControl, tutor;

    public Alumno(String n, int e, String c, String[] h, String nc, String t) {
        super(n, e, c, h);
        this.setNControl(nc);
        this.setTutor(t);
        System.out.println("En la clase alumno");
    }

    public void setNControl(String nControl) {
        this.nControl = nControl;
    }
    public String getNControl() {
        return nControl;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    public String getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        String regresa = "";
        regresa = "Nombre\tEdad\tCURP\t\t\t\tHorario\t\t\tN.Control\tTutor\n";
        regresa += super.toString();
        regresa += this.getNControl() + "\t" + this.getTutor() + "\t";
        return regresa;
    }
}
