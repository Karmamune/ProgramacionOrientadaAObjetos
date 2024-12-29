package t3.clase_base_y_extendida;

/**
 *
 * @author manuel
 */
public class Perro extends Animal {
    public Perro(int patas, int ojos, String raza){
        super(patas, ojos, raza);
    }

    public String habla(){
        return "Soy un perro " +super.habla()+ "de raza " +getRaza();
    }
}
