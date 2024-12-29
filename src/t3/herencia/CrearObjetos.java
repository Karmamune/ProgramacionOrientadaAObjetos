package t3.herencia;

/**
 *
 * @author manuel
 */
public class CrearObjetos {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno("Manuel", 20, "GALM030912HTSRPNA7", new String[]{"7:00", "13:00"}, "C21380474", "Dante");
        Docente doc1 = new Docente("Carlos", 44, "HEMC790510HTSRRRA5", new String[]{"10:00", "15:00"}, "D213", 10000, 2, 15);
        Administrativo adm1 = new Administrativo("Isaac", 35, "HAGR880202HTSRPNA1", new String[]{"8:00", "16:00"}, "A107", 12000, "Recursos humanos");

        System.out.println("Objeto alumno:\n" + alu1 + "\n\nObjeto docente:\n" + doc1 + "\n\nObjeto administrativo:\n" + adm1);
    }
}
