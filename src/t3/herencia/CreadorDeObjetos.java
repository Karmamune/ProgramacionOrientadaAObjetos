package t3.herencia;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class CreadorDeObjetos {
    Scanner entrada = new Scanner(System.in);
    String[] arreglo;
    String nombre, CURP, nControl, tutor;
    int edad;
    Alumno alumno;
    public void inicio(){
        byte opc = 0;
        System.out.println("¿Qué tipo de objeto quiere crear?\n1) Alumno\n2) Docente\n3) Administrativo\n\n0) Salir");
        opc = entrada.nextByte();
        do{
            switch(opc){
                case 1 -> {crearAlumno();}
                case 2 -> {crearDocente();}
                case 3 -> {crearAdministrativo();}
                default -> {break;}
            }
        }while(opc != 0);
    }

    public void crearAlumno(){
        System.out.println("\nIngrese su nombre, edad, CURP, N. control y tutor");
        nombre = entrada.next();
        edad = entrada.nextInt();
        CURP = entrada.next();
        nControl = entrada.next();
        tutor = entrada.next();

        System.out.println("¿De qué tamaño quiere crear el arreglo de tamaño? Ejem (6 para 6 materias o 2 para entrada y salida)");
        String[] arreglo = new String[entrada.nextInt()];
        System.out.println("\nIngrese su horario con un enter después de cada hora");
        for(int i = 0; i < arreglo.length; i++)
            arreglo[i] = entrada.next();

        alumno = new Alumno(nombre, edad, CURP, arreglo, nControl, tutor);
        System.out.println("El objeto creado es el siguiente:\n\n" +alumno);
    }

    public void crearDocente(){

    }

    public void crearAdministrativo(){

    }
}
