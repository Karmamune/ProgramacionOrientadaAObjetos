package t2.metodos.clase;

/**
 *
 * @author manuel
 */
public class Cliente {
    public String nombre, rfc;

    public Cliente(String nombre, String rfc){
        this.nombre = nombre;
        this.rfc = rfc;
    }

    public String toString(){
        return "Nombre: " +nombre+ "\nRFC: " +rfc;
    }
}
