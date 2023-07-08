
package Service;
import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaService {
    Scanner scanner = new Scanner(System.in);
    
    /*crear cuenta*/
    public Cuenta crearCuenta() {
      Cuenta cuenta1 = new Cuenta();
        System.out.println("Ingresa numero de cuenta");
        cuenta1.setNumeroCuenta(scanner.nextInt());
        System.out.println("Ingresa el DNI del usuario");
        cuenta1.setDni(scanner.nextLong());
        System.out.println("Ingresa saldo actual");
        cuenta1.setSaldoActual(scanner.nextInt());
        
        return cuenta1;     
    }
    
    /*Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    y se la sumara a saldo actual.*/
    public void ingresar(double ingreso, Cuenta cuenta1, int saldoActual){
        System.out.println("Introduzca la cantidad de dinero que desea ingresar");
        cuenta1.setMontoIngresado(scanner.nextInt());
        

        int saldo = cuenta1.getSaldoActual() + cuenta1.getMontoIngresado();
        System.out.println(saldo);
        cuenta1.setSaldoActual(scanner.nextInt());
        System.out.println("Saldo actual: " + saldoActual);
        

    }
    
    /*Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.*/
    public void retirar(Cuenta cuenta1, double retiro, int saldoActual){
        System.out.println("Ingrese un monto a retirar");
        cuenta1.setRetiro(scanner.nextInt());
        
        if(cuenta1.getRetiro() >= cuenta1.getSaldoActual()){
            cuenta1.setSaldoActual(0);
        }else{
            saldoActual = saldoActual -= retiro;
            cuenta1.setSaldoActual(saldoActual);
            System.out.println("Tu saldo actual es de: " +saldoActual);
        }
    }
    
    /*Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.*/
    public void extraccionRapida(){
        
    }
    
    /*Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
    public void consultarSaldo(){
        
    }
    
    /*Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    public void consultarDatos(){
        
    }
}
