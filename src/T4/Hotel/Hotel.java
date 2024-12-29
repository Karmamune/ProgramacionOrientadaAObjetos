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
//    protected static Habitación[] arregloHabitación = new Habitación[10];
//    protected static int númeroDeCliente = 1;
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
//                System.out.println("No ingresó una opción válida, vuelva a intentarlo");
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
////        for(int i = 0; i < arregloHabitación.length; i++) {
////            if(c < 5){
////                ind = new HIndividual(nh, "Desocupada", "Individual", 1000, 1, 1, 1, 1, 1);
////                arregloHabitación[i] = ind;
////                nh++;
////            }
////            ind = new HIndividual(nh, "Desocupada", "Individual", 1000, 1, 1, 1, 1, 1);
////            arregloHabitación[i] = ind;
////            dob = new HDoble(nh, "Desocupada", "Doble", 1750, 2, 2, 1, 2, 1, 1);
////            arregloHabitación[i + 4] = dob;
////            nh++;
////            
////            
////        }
//        
////        int nh = 101, ciclos = 1, c = 1, j = 0;
////        while(ciclos == 1 && c < 5){
////            ind = new HIndividual((nh+100), "Desocupada", "Individual", 1000, 1, 1, 1, 1, 1); agarra la variable nh + 100
////            arregloHabitación[j+4] = ind; agarra posición j + 4
////            nh++;
////            c++;
////            j++;
////        }
//        
//        int nh = 101, ciclos = 1, c = 1, j = 0;
//        while(ciclos == 1 && c < 5){
//            ind = new HIndividual(nh, "Desocupada", "Individual", 1000, 1, 1, 1, 1, 1);
//            arregloHabitación[j] = ind;
//            nh++;
//            c++;
//            j++;
//        }
//        nh = 201; ciclos = 2; c = 1;
//        while(ciclos == 2 && c < 5){
//            dob = new HDoble(nh, "Desocupada", "Doble", 1750, 2, 2, 1, 2, 1, 1);
//            arregloHabitación[j] = dob;
//            nh++;
//            c++;
//            j++;
//        }
//        nh = 301; ciclos = 3; c = 1;
//        while(ciclos == 3 && c < 3){
//            esp = new HEspecial(nh, "Desocupada", "Especial", 5000, 4, 2, 2, 7, 1, 4, 4, 1);
//            arregloHabitación[j] = esp;
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
//                               Bienvenido al Hotel García
//                               Sucursal Victoria, 
//                               Avenida Vía Láctea.
//                               8341234567
//                               
//                               ¿Qué operación desea realizar?
//                               1) Registrar cliente
//                               2) Sacar factura de cliente
//                               3) Ver habitaciones
//                               4) Liberar habitación
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
//                    System.out.println("\nNo ha ingresado una opción válida, vuelva a intentarlo");
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
//                    System.out.println("\nIngrese el nombre, el RFC y la dirección del cliente");
//                    cl = new Cliente(númeroDeCliente, entrada.next(), entrada.next(), entrada.next());
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
//                    System.out.println("\n¿Cuántas habitaciones quiere el cliente?");
//                    int númDeH = entrada.nextInt();
//                    int númDeHR = 1;
//
//
//                    do{
//                        int condición = 0;
//                        System.out.println("\nRegistrando habitación " +númDeHR+ "/" +númDeH);
//                        System.out.println("¿Qué tipo de habitación quiere el cliente?\n1) Individual\n2) Doble\n3) Especial\n0) Salir");
//                        byte tipo = entrada.nextByte();
//                        switch(tipo){
//                            case 1 -> {
//                                for(int i = 0; i < arregloHabitación.length; i++){
//                                    if(arregloHabitación[i].estatus == "Desocupada" && arregloHabitación[i].número < 105){
//                                        arregloHabitación[i].estatus = "Ocupada por cliente" +númeroDeCliente;
//                                        condición++;
//                                        break;
//                                    }
//                                }
//                                if(condición == 0)
//                                        System.out.println("\nNo hay habitaciones individuales desocupadas");
//                            }
//                            case 2 -> {
//                                for(int i = 0; i < arregloHabitación.length; i++){
//                                    if(arregloHabitación[i].estatus == "Desocupada" && arregloHabitación[i].número > 200 && arregloHabitación[i].número < 205){
//                                        arregloHabitación[i].estatus = "Ocupada por cliente" +númeroDeCliente;
//                                        condición++;
//                                        break;
//                                    }
//                                }
//                                if(condición == 0)
//                                        System.out.println("\nNo hay habitaciones dobles desocupadas");
//                            }
//                            case 3 -> {
//                                for(int i = 0; i < arregloHabitación.length; i++){
//                                    if(arregloHabitación[i].estatus == "Desocupada" && arregloHabitación[i].número > 300 && arregloHabitación[i].número < 303){
//                                        arregloHabitación[i].estatus = "Ocupada por cliente" +númeroDeCliente;
//                                        condición++;
//                                        break;
//                                    }
//                                }
//                                if(condición == 0)
//                                        System.out.println("\nNo hay habitaciones individuales desocupadas");
//                            }
//                            default -> {
//                                opc = 0;
//                            }
//                        }
//                        númDeHR++;
//                        if(condición == 0)
//                            númDeHR = númDeHR - 1;
//                    }while(númDeHR < númDeH + 1 && opc != 0);
//
//                    System.out.println("\nCliente registrado exitosamente");
//                    númeroDeCliente++;
//                    ca++;
//
//                    System.out.println("\n\n¿Quiere registrar otro cliente?\n1) Sí\n0) No");
//                    opc = entrada.nextByte();
//                    ciclo = false;
//                }
//                catch (InputMismatchException e) {
//                   System.out.println("\nNo ha ingresado un dato válido, vuelva a intentarlo\n");
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
//                                + "Número\tNombre\tRFC\tDirección");
//                        for(int i = 0; i < arregloC.length - 1; i++)
//                            System.out.println(arregloC[i]);
//
//                        System.out.println("\n¿De cuál cliente quiere sacar la factura?");
//                        int núm = entrada.nextInt();
//                        String string = "Ocupada por cliente" +núm;
//                        double total = 0;
//                        for(int i = 0; i < arregloC.length - 1; i++)
//                            if(arregloC[i].número == núm)
//                                System.out.println("\n==============================\n\nHotel García\nSucursal Victoria,\n"
//                                        + "Avenida Vía Láctea.\n8341234567\n\n[Cliente]\nNombre\tRFC\tDirección\n" 
//                                        +arregloC[i].nombre+ "\t" +arregloC[i].RFC+ "\t" +arregloC[i].dirección);
//
//                        System.out.println("\n[Habitaciones]");
//                        for(int i = 0; i < arregloHabitación.length; i++)
//                            if(arregloHabitación[i].estatus.equals(string)){
//                                    System.out.println(arregloHabitación[i].tipo);
//                                    total += arregloHabitación[i].precio;
//                            }
//                        System.out.println("\nCostos totales: " +total+ "\n\n==============================");
//                    }else
//                        System.out.println("\nNingún cliente ha sido registrado");
//                    ciclo = false;
//                }
//                catch (InputMismatchException e) {
//                    System.out.println("No ha ingresado un dato, válido, por favor vuelva a intentarlo");
//                    entrada.nextLine();
//                }
//            }while (ciclo);
//        }while(opc != 0);
//    }
//    
//    protected static void verHabitaciones() {
//        byte opc = 0;
//        boolean ciclo = true;
//        System.out.println("\nNúmero\tEstatus\t\t\tTipo\t\tPrecio");
//        do{
//            for(int i = 0; i < arregloHabitación.length; i++)
//                System.out.println(arregloHabitación[i].número+ "\t" +arregloHabitación[i].estatus+
//                        "\t\t" +arregloHabitación[i].tipo+ "\t\t" +arregloHabitación[i].precio+ " MXN");
//            
//            do {    
//                try {
//                    System.out.println("\n0) Atrás");
//                    opc = entrada.nextByte();
//                    ciclo = false;
//                }
//                catch (InputMismatchException e) {
//                    System.out.println("\nNo ingresó una opción válida\n");
//                    entrada.nextLine();
//                }
//            }while (ciclo);
//        }while(opc != 0);
//    }
//    
//    protected static void liberar() {
//        byte opc = 0;
//        int condición = 0;
//        boolean ciclo = true;
//        do {
//            do {
//                try {
//                    System.out.println("\nIngrese el número de la habitación que quiera liberar");
//                    int núm = entrada.nextInt();
//                    for(int i = 0; i < arregloHabitación.length; i++)
//                        if(arregloHabitación[i].número == núm && arregloHabitación[i].estatus != "Desocupada"){
//                            arregloHabitación[i].estatus = "Desocupada";
//                            System.out.println("\nHabitación liberada con éxito");
//                            condición = 1;
//                        }
//                    if(condición == 0)
//                        System.out.println("\nLa habitación que seleccionó no se encuentra ocupada o no existe");
//
//                    System.out.println("\n¿Quiere liberar otra habitación?\n1) Sí\n0) No");
//                    opc = entrada.nextByte();
//                    ciclo = false;
//                }
//                catch (InputMismatchException e) {
//                    System.out.println("\nNo ha ingresado un dato válido, vuelva a intentarlo\n");
//                    entrada.nextLine();
//                }
//            }while (ciclo);
//        }while(opc != 0);
//    }
//}
