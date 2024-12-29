package T6.Archivos.Archivos;

import java.io.*;
        
/**
 *
 * @author Manuel
 */
public class IOStreamDemo {
    public void respaldo() throws IOException {
        String s = new String();
        try {
            BufferedReader arch_ent = new BufferedReader (new FileReader ("empleados.txt"));
            PrintWriter arch_sal = new PrintWriter (new BufferedWriter (new FileWriter ("backup.txt")));
            arch_sal.println("ARCHIVO DE RESPALDO IMPORTANTE");
            while((s = arch_ent.readLine()) != null)
                arch_sal.println(s);
            arch_ent.close();
            arch_sal.close();
        }
        catch (EOFException e) {
            System.err.println("Fin del stream");
        }
    }
    
    //envía las excepciones a consola
    public void creaIOStreams() throws IOException {
        
        //1. leer entrada a linea de un arch_ent externo
        BufferedReader arch_ent = new BufferedReader (new FileReader ("entrada.txt"));
        String s, s2 = new String();
        while((s = arch_ent.readLine()) != null)
            s2 += s + "\n";
        arch_ent.close();
        
        //1b. leer entrada estandar (teclado)
        BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Introduce una línea: ");
        System.out.println(teclado.readLine());
        
        //2. leer de memoria caracter por caracter
        StringReader memoria = new StringReader(s2);
        int c;
        System.out.println("Primera impresión del arch_ent empleados.txt");
        while((c = memoria.read()) != -1)
            System.out.print((char)c);
        
        //3. entrada formateado de memoria
        try {
            DataInputStream in3 = new DataInputStream (new ByteArrayInputStream (s2.getBytes()));
            
            while(true)
                //System-out.println(in3.readByte());
                System.out.print((char)in3.readByte());
        }
        catch (EOFException e) {
            System.err.println("Fin del stream (flujo de datos");
        }
        
        //4. salida a arch_sal
        try {
            BufferedReader in4 = new BufferedReader (new StringReader(s2));
            PrintWriter arch_sal = new PrintWriter (new BufferedWriter (new FileWriter("codigoSal.txt")));
            
            int cuentalineas = 1;
            while((s = in4.readLine()) != null)
                arch_sal.println(cuentalineas++ + ": " + s);
            arch_sal.close();
        }
        catch (EOFException e) {
            System.err.println("Fin del stream");
        }
        
        //5. guardar y recuperar datos
        try {
            DataOutputStream arch_salida = new DataOutputStream (new BufferedOutputStream (new FileOutputStream("Datos.txt")));
            arch_salida.writeDouble(3.14159);
            arch_salida.writeChars("Eso fue el valor de PI con método writeChars\n");
            arch_salida.writeBytes("Eso fue el valor de PI con método writeBytes\n");
            arch_salida.close();
            DataInputStream entrada5 = new DataInputStream (new BufferedInputStream (new FileInputStream("Datos.txt")));
            BufferedReader in5br = new BufferedReader (new InputStreamReader (entrada5));
            //debe emplearse un DataInputStream
            System.out.println(entrada5.readDouble());
            //se lee cada linea
            System.out.println(in5br.readLine());
            //otra manera de leer lineas (más adecuado)
            System.out.println(in5br.readLine());
        }
        catch (EOFException e) {
            System.err.println("Fin del stream");
        }
        respaldo();
    } //método creaIOStream
}
