package t3.clase_base_y_extendida;

/**
 *
 * @author manuel
 */
public class Animal {
    protected int patas;
    private int ojos;
    protected String raza;

    public Animal(int patas, int ojos, String raza){
        this.setPatas(patas);
        this.setOjos(ojos);
        this.setRaza(raza);
    }

    protected void setPatas(int p) {
        patas = p;
    }
    protected int getPatas() {
        return patas;
    }

    protected void setOjos(int o) {
        ojos = o;
    }
    protected int getOjos() {
        return ojos;
    }

    protected void setRaza(String r) {
        raza = r;
    }
    protected String getRaza() {
        return raza;
    }

    public String habla(){
        return "y soy un animal que tiene " + this.getPatas() + " patas y " + this.getOjos() + " ojos\n";
    }
}
