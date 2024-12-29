package t2.computadora;

/**
 *
 * @author manuel
 */
public class Computadora {
    public int ramGB, almacenamientoGB, módulosDeRam;
    public String gabinete, placaMadre, procesador, gráfica, tipoAlmacenamiento;
    
    public Computadora(String gabinete, String placaMadre, String procesador, String gráfica, String tipoAlmacenamiento, int almacenamientoGB, int módulosDeRam, int ramGB){
        this.gabinete = gabinete;
        this.placaMadre = placaMadre;
        this.procesador = procesador;
        this.gráfica = gráfica;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.almacenamientoGB = almacenamientoGB;
        this.módulosDeRam = módulosDeRam;
        this.ramGB = ramGB;
    }

    public String toString(){
        return "Gabinete: " +this.gabinete+ "\nPlaca madre: " +this.placaMadre+ "\nProcesador: " +this.procesador+ "\nGráfica: " +this.gráfica+ "\nTipo de almacenamiento: " +this.tipoAlmacenamiento+ "\nTotal de almacenamiento: " +this.almacenamientoGB+ " GB\nMódulos de ram: " +this.módulosDeRam+ "\nCantidad de ram por módulo: " +this.ramGB+ " GB";
    }
}
