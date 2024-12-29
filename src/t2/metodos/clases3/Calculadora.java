package t2.metodos.clases3;

/**
 *
 * @author manuel
 */
public class Calculadora {
    private String marca, modelo;
    private double precio;

    public Calculadora(String marca, String modelo, double precio){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPrecio(precio);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    @Override
    public String toString(){
        return "Calculadora\nMarca: " +this.marca+ "\nModelo: " +this.modelo+ "\nPrecio: " +this.precio+ " MXN";
    }
}
