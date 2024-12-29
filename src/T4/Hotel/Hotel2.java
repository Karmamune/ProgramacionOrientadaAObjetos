package T4.Hotel;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Manuel
 */
public class Hotel2 {
    
    protected static Scanner entrada = new Scanner(System.in);
    
    protected static HIndividual ind;
    protected static HDoble dob;
    protected static HEspecial esp;
    protected static Habitaci�n[] aH = new Habitaci�n[15]; //arreglo de habitaciones
    
    protected static Cliente aC[] = new Cliente[1]; //arreglo de clientes
    protected static Cliente temp[]; //arreglo temporal
    protected static Cliente cl;
    
    protected static Factura f;
    
    protected static int numC = 1, ca = 0; //variable para llevar control de los clientes y el contador del �ndice del arreglo
    
    protected static Archivos manejo = new Archivos();
    protected static LeerArchivo leer = new LeerArchivo();
    
    public static void main (String[] args) {
        inicio();
    }
    
    protected static void inicio() {
        int i = 0, c = 1, nH = 101;
        while (c < 6) {
            ind = new HIndividual(nH, "Desocupada", "Individual", 800, 1, 1, 1, 1, 1);
            aH[i] = ind;
            
            dob = new HDoble((nH+100), "Desocupada", "Doble     ", 1200, 2, 2, 1, 2, 1, 1);
            aH[i+5] = dob;
            
            esp = new HEspecial((nH+200), "Desocupada", "Especial", 5000, 4, 2, 2, 7, 1, 4, 4, 1);
            aH[i+10] = esp;
            
            i++;
            c++;
            nH++;
        }
        
        menu();
    }
    
    protected static void menu() {
        byte opc = 0;
        boolean ciclo = true;
        
        System.out.print("""
                           Bienvenido al Hotel Garc�a
                           Sucursal Victoria, 
                           Avenida V�a L�ctea.
                           8341234567
                           """);
        do {
            System.out.println("""
                               
                               �Qu� operaci�n desea realizar?
                               1) Registrar cliente
                               2) Facturar cliente
                               3) Ver habitaciones
                               4) Liberar habitaci�n
                               0) Salir
                               """);
            System.out.print("> ");
            do {
                try {
                    opc = entrada.nextByte();
                    switch (opc) {
                        case 1 -> {registrar();}
                        case 2 -> {facturar();}
                        case 3 -> {verH();}
                        case 4 -> {liberar();}
                        default -> {break;}
                    }
                    ciclo = false;
                }
                catch (InputMismatchException e) {
                    System.out.print("\nNo ha ingresado una opci�n v�lida, vuelva a intentarlo\n> ");
                    entrada.nextLine();
                }
            }while (ciclo);
        }while (opc != 0);
    }
    
    protected static void registrar() {
        byte opc = 1;
        boolean ciclo = true;
        do{ 
            do {
                try {
                    System.out.print("\nIngrese el n�mero, nombre, el RFC y la direcci�n del cliente\n> ");
                    cl = new Cliente(entrada.next(), entrada.next(), entrada.next(), entrada.next());
                    aC[ca] = cl;
        
                    temp = new Cliente[aC.length + 1];
                    for(int i = 0; i < aC.length; i++)
                        temp[i] = aC[i];

                    aC = temp;

                    System.out.print("\n�Cu�ntas habitaciones quiere el cliente?\n> ");
                    int n�mDeH = entrada.nextInt();
                    int n�mDeHR = 1;


                    do{
                        int condici�n = 0;
                        System.out.println("\nRegistrando habitaci�n " +n�mDeHR+ "/" +n�mDeH);
                        System.out.print("�Qu� tipo de habitaci�n quiere el cliente?\n1) Individual\n2) Doble\n3) Especial\n0) Salir\n> ");
                        byte tipo = entrada.nextByte();
                        switch(tipo){
                            case 1 -> {
                                for(int i = 0; i < aH.length; i++){
                                    if(aH[i].estatus == "Desocupada" && aH[i].n�mero < 105){
                                        aH[i].estatus = "Ocupada por cliente" +numC;
                                        condici�n++;
                                        break;
                                    }
                                }
                                if(condici�n == 0)
                                        System.out.println("\nNo hay habitaciones individuales desocupadas");
                            }
                            case 2 -> {
                                for(int i = 0; i < aH.length; i++){
                                    if(aH[i].estatus == "Desocupada" && aH[i].n�mero > 200 && aH[i].n�mero < 205){
                                        aH[i].estatus = "Ocupada por cliente" +numC;
                                        condici�n++;
                                        break;
                                    }
                                }
                                if(condici�n == 0)
                                        System.out.println("\nNo hay habitaciones dobles desocupadas");
                            }
                            case 3 -> {
                                for(int i = 0; i < aH.length; i++){
                                    if(aH[i].estatus == "Desocupada" && aH[i].n�mero > 300 && aH[i].n�mero < 303){
                                        aH[i].estatus = "Ocupada por cliente" +numC;
                                        condici�n++;
                                        break;
                                    }
                                }
                                if(condici�n == 0)
                                        System.out.println("\nNo hay habitaciones individuales desocupadas");
                            }
                            default -> {
                                opc = 0;
                            }
                        }
                        n�mDeHR++;
                        if(condici�n == 0)
                            n�mDeHR = n�mDeHR - 1;
                    }while(n�mDeHR < n�mDeH + 1 && opc != 0);

                    System.out.println("\nCliente registrado exitosamente");
                    
                    calcularTotal();
                    
                    numC++;
                    ca++;

                    System.out.print("\n\n�Quiere registrar otro cliente?\n1) S�\n0) No\n> ");
                    opc = entrada.nextByte();
                    ciclo = false;
                }
                catch (InputMismatchException e) {
                   System.out.println("\nNo ha ingresado un dato v�lido, vuelva a intentarlo\n");
                   entrada.nextLine();
                }
            }while(ciclo);
        }while(opc != 0);
    }
    
    protected static void calcularTotal() {
        String s = "Ocupada por cliente" +numC;
        double total = 0;
        
        for(int i = 0; i < aH.length; i++)
            if(aH[i].estatus.equals(s))
                total += aH[i].precio;
        
        f = new Factura(cl.n�mero, cl.nombre, cl.RFC, cl.direcci�n, total);
        
        guardarRegistro();
    }
    
    protected static void guardarRegistro() {
        manejo.abrirArchivo();
        manejo.agregarClientes(f.n�mero, f.nombre, f.rfc, f.direcci�n, f.total);
        manejo.cerrarArchivo();
        System.out.println("Registro guardado exitosamente");
    }
    
    protected static void facturar() {
        leer.abrirArchivo();
        leer.leerContenido();
        leer.cerrarArchivo();
    }
    
    protected static void verH () {
        byte opc = 0;
        boolean ciclo = true;
        System.out.println("\nN�mero\t\tTipo\t\tPrecio\t\tEstatus");
        do {
            for(int i = 0; i < aH.length; i++) 
                System.out.println(aH[i].infoH());
            
            do {
                try {
                    System.out.print("\n0) Atr�s\n\n> ");
                    opc = entrada.nextByte();
                    ciclo = false;
                }
                catch (InputMismatchException e) {
                    System.out.println("\nNo ingres� una opci�n v�lida\n");
                    entrada.nextLine();
                }
            }while (ciclo);
        }while (opc != 0);
    }
    
    protected static void liberar() {
        byte opc = 0;
        int condici�n = 0;
        boolean ciclo = true;
        do {
            do {
                try {
                    System.out.print("\nIngrese el n�mero de la habitaci�n que quiera liberar\n> ");
                    int n�m = entrada.nextInt();
                    for(int i = 0; i < aH.length; i++)
                        if(aH[i].n�mero == n�m && aH[i].estatus != "Desocupada"){
                            aH[i].estatus = "Desocupada";
                            System.out.println("\nHabitaci�n liberada con �xito");
                            condici�n = 1;
                        }
                    if(condici�n == 0)
                        System.out.println("\nLa habitaci�n que seleccion� no se encuentra ocupada o no existe");

                    System.out.print("\n�Quiere liberar otra habitaci�n?\n1) S�\n0) No\n\n> ");
                    opc = entrada.nextByte();
                    ciclo = false;
                }
                catch (InputMismatchException e) {
                    System.out.println("\nNo ha ingresado un dato v�lido, vuelva a intentarlo\n");
                    entrada.nextLine();
                }
            }while (ciclo);
        }while(opc != 0);
    }
}