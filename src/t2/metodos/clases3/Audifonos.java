package t2.metodos.clases3;

/**
 *
 * @author manuel
 */
public class Audifonos {
    private String marca, tipo, tipoDeConexión, color;
    private double precio;

    public Audifonos(String marca, String tipo, String tipoDeConexión, String color, double precio){
        this.setMarca(marca);
        this.setTipo(tipo);
        this.setTipoDeConexión(tipoDeConexión);
        this.setColor(color);
        this.setPrecio(precio);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }

    public void setTipoDeConexión(String tipoDeConexión){
        this.tipoDeConexión = tipoDeConexión;
    }
    public String getTipoDeConexión(){
        return tipoDeConexión;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }

    @Override
    public String toString(){
        return "Audífonos\nMarca: " +this.marca+ "\nTipo: " +this.tipo+
                "\nTipo de conexión: " +this.tipoDeConexión+ "\nColor: " +this.color+
                "\nPrecio: " +this.precio+ " MXN";
    }
}
