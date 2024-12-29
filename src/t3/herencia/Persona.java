package t3.herencia;

/**
 *
 * @author manuel
 */
public class Persona {
    public String nombre, CURP;
    public String[] horario;
    public int edad;

    public Persona(String n, int e, String c, String[] h) {
        this.setNombre(n);
        this.setEdad(e);
        this.setCURP(c);
        this.setHorario(h);
        System.out.println("En la clase persona");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
         return edad;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
    public String getCURP() {
        return CURP;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }
    public String getHorario() {
        String horas = "";
        for(int i = 0; i < this.horario.length; i++){
            horas += horario[i];
        }
        return horas;
    }

    @Override
    public String toString() {
        return this.getNombre() + "\t" + this.getEdad() + "\t\t" + this.getCURP() + "\t" + getHorario() + "\t";
    }
}
