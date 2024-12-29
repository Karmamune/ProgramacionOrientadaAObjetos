package t2.metodos.ejercicios;

/**
 *
 * @author manuel
 */
public class Cliente {
    private String Nombre;
    private String RFC;

    public Cliente(String N, String rfc){
        this.setNombre(N);
        this.setRFC(rfc);
    }

    public void setNombre(String nombre){
        this.Nombre = nombre;
    }

    public void setRFC(String rfc){
        this.RFC = rfc;
    }
}
