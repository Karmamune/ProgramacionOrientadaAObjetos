package t2.metodos.clases3;

/**
 *
 * @author manuel
 */
public class Reloj {
    private String marca, color, tipo;
    private double precio;

    public Reloj(String marca, String color, String tipo, double precio){
        this.setMarca(marca);
        this.setColor(color);
        this.setTipo(tipo);
        this.setPrecio(precio);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }

    @Override
    public String toString(){
        return "Reloj\nMarca: " +this.marca+ "\nColor: " +this.color+ "\nTipo: " +this.tipo+ "\nPrecio: " +this.precio+ " MXN";
    }
}
