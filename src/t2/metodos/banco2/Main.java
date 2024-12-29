package t2.metodos.banco2;

/**
 *
 * @author manuel
 */
public class Main {
    /*
    Crear un programa que maneje cuentas bancarias, por lo que habrá que crear
    una clase cuenta, que maneje como atributos el número de cuenta, la cual
    estará dada por 6 dígitos, nombre del cliente y saldo. Generar los métodos
    getters y setters correspondientes así como el método toString. *(No olvide encapsular
    los datos miembro). Crear un método llamado abonar, el cual permitirá recibir depósitos
    para incrementar el saldo de la cuenta. También deberá crear un método retirar, el cual permitirá
    hacer retiros del saldo y deberá descontar dicho retiro.

    Por último debrá crear una clase banco que permita manejar las cuentas de los clientes y hacer
    los movimientos de saldo. En esta clase deberá crear 3 objetos de tipo cuenta los cuales
    tendrán un saldo inicial de 10,000, 20,000 y 30,000 pesos respectivamente. Posteriormente,
    se les podrán hacer depósitos y retiros.
     */

    public static void main(String[] args){
        Banco inicio = new Banco();
        inicio.definirArreglo();
    }
}
