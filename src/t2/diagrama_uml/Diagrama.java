package t2.diagrama_uml;

/**
 *
 * @author manuel
 */
public class Diagrama {
    private void escuela(){
        String nombre, dirección, númTelGen, páginaWeb;
        int reputación;

        publicarEnRedes();
    }

    void edificios(){
        escuela();
        byte nDePisos;
        String color;

        abrir();
        cerrar();
        prenderGen();
        apagarGen();
        prenderAire();
        apagarAire();
    }

    void oficinas(){
        edificios();
        int nEscritorio, nComputadoras;

        prenderComp();
        apagarComp();
    }

    void salones(){
        edificios();
        char bloque;
        byte nSalón;
        int nBancos;

        abrirVentana();
        cerrarVentana();
    }

    void personal(){
        escuela();
        String tipoPersonal, nombre, horario, email;

        entrar();
        salir();
    }

    void trabajadores(){
        personal();
        double sueldo;

        registrarEnt();
        registrarSal();
    }

    void coordinadores(){
        trabajadores();
        String deCarrera;

        darAltaMat();
        darBajaMat();
    }

    void administrativos(){
        trabajadores();
        String tipoPersonal;

        contratarPersonal();
    }

    void docentes(){
        trabajadores();
        String departamento;

        iniciarClase();
        terminarClase();
    }

    void alumnos(){
        materias();
        personal();
        int edad;
        String carrera, nControl;

        registrarMate();
        tomarClase();
    }

    void materias (){
        docentes();
        String nombreDeMateria, hora;
    }

    void grupos(){
        alumnos();
        salones();
        int nGrupo, nAlumnos;

        asignarSalón();
    }
    public void publicarEnRedes(){
    }
    public void abrir(){
    }
    public void cerrar(){
    }
    public void prenderGen(){
    }
    public void apagarGen(){
    }
    public void prenderAire(){
    }
    public void apagarAire(){
    }
    public void prenderComp(){
    }
    public void apagarComp(){
    }
    public void abrirVentana(){
    }
    public void cerrarVentana(){
    }
    public void entrar(){
    }
    public void salir(){
    }
    public void registrarEnt(){
    }
    public void registrarSal(){
    }
    public void darAltaMat(){
    }
    public void darBajaMat(){
    }
    public void contratarPersonal(){
    }
    public void iniciarClase(){
    }
    public void terminarClase(){
    }
    public void registrarMate(){
    }
    public void tomarClase(){
    }
    public void asignarSalón(){
    }
}
