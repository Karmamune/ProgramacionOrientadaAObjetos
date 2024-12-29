package t3.clase_base_y_extendida;

/**
 *
 * @author manuel
 */
public class Loro extends Animal {
    protected String colorPlumas;

    public Loro(int patas, int ojos, String raza, String colorPlumas){
        super(patas, ojos, raza);
        this.colorPlumas = colorPlumas;
    }

    protected void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    protected String getColorPlumas() {
        return colorPlumas;
    }

    public String habla(){
        return "Soy un loro " +super.habla()+ "de raza " +this.getRaza()+ " con plumas de color " +this.getColorPlumas();
    }
}
