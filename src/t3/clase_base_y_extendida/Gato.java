package t3.clase_base_y_extendida;

/**
 *
 * @author manuel
 */
public class Gato extends Animal {
    public Gato(int patas, int ojos, String raza){
        super(patas, ojos, raza);
    }



    //herencia con redifinición de método
    public String habla(){
        return "Soy un gato " +super.habla()+ "de raza " +getRaza();
    }
}
