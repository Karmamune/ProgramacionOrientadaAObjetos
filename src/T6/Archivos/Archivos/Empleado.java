package T6.Archivos.Archivos;

/**
 *
 * @author Manuel
 */
public class Empleado {
    String nombre;
    int numEmpleado;
    float sueldo;
    
    public Empleado(String nombre, int numEmpleado, float sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    
    public Empleado() {
        this.nombre = null;
        this.numEmpleado = 0;
        this.sueldo = 0.0f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public float IncrementaSueldo (float inc) {
        return (this.sueldo*inc+this.sueldo);
    }
    
    public void Imprimir() {
        System.out.println("Nombre de empleado: " +nombre);
        System.out.println("Número de empleado: " +numEmpleado);
        System.out.println("Su sueldo es: " +sueldo);
    }
}
