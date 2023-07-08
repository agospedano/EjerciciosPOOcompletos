
package Entidad;



/**
 *
 * @author Usuario
 */
public class Cuenta {

    
    /*atributos*/
    private int numeroCuenta;
    private long dni;
    private int saldoActual;
    private int montoIngresado;
    private int retiro;

    
    /*construtor vacio*/

    public Cuenta() {
    }
    
    /*constructor por parametro*/

    public Cuenta(int numeroCuenta, long dni, int saldoActual, int montoIngresado, int retiro) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.montoIngresado = montoIngresado;
        this.retiro = retiro;
    }
    
    /*getter*/

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public int getMontoIngresado() {
        return montoIngresado;
    }

    public int getRetiro() {
        return retiro;
    }

    
    
    
    
    /*setter*/

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }    

    public void setMontoIngresado(int montoIngresado) {
        this.montoIngresado = montoIngresado;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }
    
    
}
