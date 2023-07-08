
package Entidad;

/**
 *
 * @author Usuario
 */
public class NIF {
    /*atributos*/
    private long dni;
    private char letra;
    
    /*constructor vacio*/
    public NIF() {
    }
    
    /*constructor por parametro*/
    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }
    
    /*getters*/

    public long getDni() {
        return dni;
    }

    public char getLetra() {
        return letra;
    }
    
    /*setters*/

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
}
