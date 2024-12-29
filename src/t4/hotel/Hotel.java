package t4.hotel;

//package T4.Hotel;
//
//import java.util.Scanner;
//import java.util.InputMismatchException;
//
///**
// *
// * @author Manuel
// */
//public class Hotel {
//    
//    protected static HIndividual ind;
//    protected static HDoble dob;
//    protected static HEspecial esp;
//    protected static Cliente cl;
//    protected static Factura[] f;
//    protected static Scanner entrada = new Scanner(System.in);
//    protected static int contador = 0, ca = 0;
//    protected static Cliente arregloC[] = new Cliente[1];
//    protected static Cliente arregloTemporal[];
//    protected static Habitaci�n[] arregloHabitaci�n = new Habitaci�n[10];
//    protected static int n�meroDeCliente = 1;
//    
//    public static void main(String[] args){
//        byte opc = 0;
//        do{
//            inicio();
//        }while(opc != 0);
//    }
//    
////    protected static void inicio() {
////        byte opc = 0;
////        do {
////                
////                System.out.println("Bienvenido\n1) Comenzar\n0) Salir");
////                int opc2 = entrada.nextInt();
////                if(opc2 == 1)
////                    crearHabitaciones();
////        }while(opc != 0);
////    }
//    
//    protected static void inicio() {
//        byte opc = 0;
//        boolean ciclo = true;
//        do {
//            try {
//                System.out.println("Bienvenido\n1) Comenzar\n0) Salir");
//                opc = entrada.nextByte();
//                if (opc == 1)
//                    crearHabitaciones();
//                ciclo = false;
//            }
//            catch (InputMismatchException e) {
//                System.out.println("No ingres� una opci�n v�lida, vuelva a intentarlo");
//                entrada.nextLine();
//            }
//        }while (ciclo);
//    }
//    
//    protected static void crearHabitaciones() {
//        
//        /*
//        Creando habitaciones
//        4 individuales
//        4 dobles
//        2 especiales
//        */
//        
//        
//        
//        
////        int nh = 101, c = 1;
////        for(int i = 0; i < arregloHabitaci�n.length; i++) {
////            if(c < 5){
////                ind = new HIndividual(nh, "Desocupada", "Individual", 1000, 1, 1, 1, 1, 1);
////                arregloHabitaci�n[i] = ind;
////                nh++;
////            }
////            ind = new HIndividual(nh, "Desocupada", "Individual", 1000, 1, 1, 1, 1, 1);
////            arregloHabitaci�n[i] = ind;
////            dob = new HDoble(nh, "Desocupada", "Doble", 1750, 2, 2, 1, 2, 1, 1);
////            arregloHabitaci�n[i + 4] = dob;
////            nh++;
////            
////            
////        }
//        
////        int nh = 101, ciclos = 1, c = 1, j = 0;
////        while(ciclos == 1 && c < 5){
////            ind = new HIndividual((nh+100), "Desocupada", "Individual", 1000, 1, 1, 1, 1, 1); agarra la variable nh + 100
////            arregloHabitaci�n[j+4] = ind; agarra posici�n j + 4
////            nh++;
////            c++;
////            j++;
////        }
//        
//        int nh = 101, ciclos = 1, c = 1, j = 0;
//        while(ciclos == 1 && c < 5){
//            ind = new HIndividual(nh, "Desocupada", "Individual", 1000, 1, 1, 1, 1, 1);
//            arregloHabitaci�n[j] = ind;
//            nh++;
//            c++;
//            j++;
//        }
//        nh = 201; ciclos = 2; c = 1;
//        while(ciclos == 2 && c < 5){
//            dob = new HDoble(nh, "Desocupada", "Doble", 1750, 2, 2, 1, 2, 1, 1);
//            arregloHabitaci�n[j] = dob;
//            nh++;
//            c++;
//            j++;
//        }
//        nh = 301; ciclos = 3; c = 1;
//        while(ciclos == 3 && c < 3){
//            esp = new HEspecial(nh, "Desocupada", "Especial", 5000, 4, 2, 2, 7, 1, 4, 4, 1);
//            arregloHabitaci�n[j] = esp;
//            nh++;
//            c++;
//            j++;
//        }
//
//        menu();
//    }
//        
//    protected static void menu() {
//        byte opc = 0;
//        boolean ciclo = true;
//        do{
//            System.out.println("""
//                               
//                               Bienvenido al Hotel Garc�a
//                               Sucursal Victoria, 
//                               Avenida V�a L�ctea.
//                               8341234567
//                               
//                               �Qu� operaci�n desea realizar?
//                               1) Registrar cliente
//                               2) Sacar factura de cliente
//                               3) Ver habitaciones
//                               4) Liberar habitaci�n
//                               0) Salir""");
//            do {
//                try {
//                    opc = entrada.nextByte();
//                    switch(opc) {
//                        case 1 -> registrarCliente();
//                        case 2 -> facturar();
//                        case 3 -> verHabitaciones();
//                        case 4 -> liberar();
//                        default -> {break;}
//                    }
//                    ciclo = false;
//                }
//                catch (InputMismatchException e) {
//                    System.out.println("\nNo ha ingresado una opci�n v�lida, vuelva a intentarlo");
//                    entrada.nextLine();
//                }
//            }while(ciclo);
//        }while(opc != 0);
//    }
//    
//    protected static void registrarCliente() {
//        byte opc = 1;
//        boolean ciclo = true;
//        do{ 
//            do {
//                try {
//                    System.out.println("\nIngrese el nombre, el RFC y la direcci�n del cliente");
//                    cl = new Cliente(n�meroDeCliente, entrada.next(), entrada.next(), entrada.next());
//                    arregloC[ca] = cl;
//
//
//
//                    arregloTemporal = new Cliente[arregloC.length + 1];
//                    for(int i = 0; i < arregloC.length; i++)
//                        arregloTemporal[i] = arregloC[i];
//
//                    arregloC = arregloTemporal;
//
//                    System.out.println("\n�Cu�ntas habitaciones quiere el cliente?");
//                    int n�mDeH = entrada.nextInt();
//                    int n�mDeHR = 1;
//
//
//                    do{
//                        int condici�n = 0;
//                        System.out.println("\nRegistrando habitaci�n " +n�mDeHR+ "/" +n�mDeH);
//                        System.out.println("�Qu� tipo de habitaci�n quiere el cliente?\n1) Individual\n2) Doble\n3) Especial\n0) Salir");
//                        byte tipo = entrada.nextByte();
//                        switch(tipo){
//                            case 1 -> {
//                                for(int i = 0; i < arregloHabitaci�n.length; i++){
//                                    if(arregloHabitaci�n[i].estatus == "Desocupada" && arregloHabitaci�n[i].n�mero < 105){
//                                        arregloHabitaci�n[i].estatus = "Ocupada por cliente" +n�meroDeCliente;
//                                        condici�n++;
//                                        break;
//                                    }
//                                }
//                                if(condici�n == 0)
//                                        System.out.println("\nNo hay habitaciones individuales desocupadas");
//                            }
//                            case 2 -> {
//                                for(int i = 0; i < arregloHabitaci�n.length; i++){
//                                    if(arregloHabitaci�n[i].estatus == "Desocupada" && arregloHabitaci�n[i].n�mero > 200 && arregloHabitaci�n[i].n�mero < 205){
//                                        arregloHabitaci�n[i].estatus = "Ocupada por cliente" +n�meroDeCliente;
//                                        condici�n++;
//                                        break;
//                                    }
//                                }
//                                if(condici�n == 0)
//                                        System.out.println("\nNo hay habitaciones dobles desocupadas");
//                            }
//                            case 3 -> {
//                                for(int i = 0; i < arregloHabitaci�n.length; i++){
//                                    if(arregloHabitaci�n[i].estatus == "Desocupada" && arregloHabitaci�n[i].n�mero > 300 && arregloHabitaci�n[i].n�mero < 303){
//                                        arregloHabitaci�n[i].estatus = "Ocupada por cliente" +n�meroDeCliente;
//                                        condici�n++;
//                                        break;
//                                    }
//                                }
//                                if(condici�n == 0)
//                                        System.out.println("\nNo hay habitaciones individuales desocupadas");
//                            }
//                            default -> {
//                                opc = 0;
//                            }
//                        }
//                        n�mDeHR++;
//                        if(condici�n == 0)
//                            n�mDeHR = n�mDeHR - 1;
//                    }while(n�mDeHR < n�mDeH + 1 && opc != 0);
//
//                    System.out.println("\nCliente registrado exitosamente");
//                    n�meroDeCliente++;
//                    ca++;
//
//                    System.out.println("\n\n�Quiere registrar otro cliente?\n1) S�\n0) No");
//                    opc = entrada.nextByte();
//                    ciclo = false;
//                }
//                catch (InputMismatchException e) {
//                   System.out.println("\nNo ha ingresado un dato v�lido, vuelva a intentarlo\n");
//                    entrada.nextLine();
//                }
//            }while(ciclo);
//        }while(opc != 0);
//    }
//        
//    protected static void facturar() {
//        byte opc = 0;
//        boolean ciclo = true;
//        do {
//            do {
//                try {
//                    if(arregloC[0] != null){
//                        System.out.println("\nClientes registrados\n\n"
//                                + "N�mero\tNombre\tRFC\tDirecci�n");
//                        for(int i = 0; i < arregloC.length - 1; i++)
//                            System.out.println(arregloC[i]);
//
//                        System.out.println("\n�De cu�l cliente quiere sacar la factura?");
//                        int n�m = entrada.nextInt();
//                        String string = "Ocupada por cliente" +n�m;
//                        double total = 0;
//                        for(int i = 0; i < arregloC.length - 1; i++)
//                            if(arregloC[i].n�mero == n�m)
//                                System.out.println("\n==============================\n\nHotel Garc�a\nSucursal Victoria,\n"
//                                        + "Avenida V�a L�ctea.\n8341234567\n\n[Cliente]\nNombre\tRFC\tDirecci�n\n" 
//                                        +arregloC[i].nombre+ "\t" +arregloC[i].RFC+ "\t" +arregloC[i].direcci�n);
//
//                        System.out.println("\n[Habitaciones]");
//                        for(int i = 0; i < arregloHabitaci�n.length; i++)
//                            if(arregloHabitaci�n[i].estatus.equals(string)){
//                                    System.out.println(arregloHabitaci�n[i].tipo);
//                                    total += arregloHabitaci�n[i].precio;
//                            }
//                        System.out.println("\nCostos totales: " +total+ "\n\n==============================");
//                    }else
//                        System.out.println("\nNing�n cliente ha sido registrado");
//                    ciclo = false;
//                }
//                catch (InputMismatchException e) {
//                    System.out.println("No ha ingresado un dato, v�lido, por favor vuelva a intentarlo");
//                    entrada.nextLine();
//                }
//            }while (ciclo);
//        }while(opc != 0);
//    }
//    
//    protected static void verHabitaciones() {
//        byte opc = 0;
//        boolean ciclo = true;
//        System.out.println("\nN�mero\tEstatus\t\t\tTipo\t\tPrecio");
//        do{
//            for(int i = 0; i < arregloHabitaci�n.length; i++)
//                System.out.println(arregloHabitaci�n[i].n�mero+ "\t" +arregloHabitaci�n[i].estatus+
//                        "\t\t" +arregloHabitaci�n[i].tipo+ "\t\t" +arregloHabitaci�n[i].precio+ " MXN");
//            
//            do {    
//                try {
//                    System.out.println("\n0) Atr�s");
//                    opc = entrada.nextByte();
//                    ciclo = false;
//                }
//                catch (InputMismatchException e) {
//                    System.out.println("\nNo ingres� una opci�n v�lida\n");
//                    entrada.nextLine();
//                }
//            }while (ciclo);
//        }while(opc != 0);
//    }
//    
//    protected static void liberar() {
//        byte opc = 0;
//        int condici�n = 0;
//        boolean ciclo = true;
//        do {
//            do {
//                try {
//                    System.out.println("\nIngrese el n�mero de la habitaci�n que quiera liberar");
//                    int n�m = entrada.nextInt();
//                    for(int i = 0; i < arregloHabitaci�n.length; i++)
//                        if(arregloHabitaci�n[i].n�mero == n�m && arregloHabitaci�n[i].estatus != "Desocupada"){
//                            arregloHabitaci�n[i].estatus = "Desocupada";
//                            System.out.println("\nHabitaci�n liberada con �xito");
//                            condici�n = 1;
//                        }
//                    if(condici�n == 0)
//                        System.out.println("\nLa habitaci�n que seleccion� no se encuentra ocupada o no existe");
//
//                    System.out.println("\n�Quiere liberar otra habitaci�n?\n1) S�\n0) No");
//                    opc = entrada.nextByte();
//                    ciclo = false;
//                }
//                catch (InputMismatchException e) {
//                    System.out.println("\nNo ha ingresado un dato v�lido, vuelva a intentarlo\n");
//                    entrada.nextLine();
//                }
//            }while (ciclo);
//        }while(opc != 0);
//    }
//}
