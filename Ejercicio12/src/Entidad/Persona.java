
package Entidad;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {
    /*atributos*/
    private String nombre;
    private Date fechaNacimiento;
    private int edad;
    private int diferenciaAnios;
    
    /*constructor vacio*/

    public Persona() {
    }
    
    /*constructor por parametro*/

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    /*getter*/

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public int getDiferenciaAnios() {
        return diferenciaAnios;
    }
    
    
    
    /*setter*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDiferenciaAnios(int diferenciaAnios) {
        this.diferenciaAnios = diferenciaAnios;
    }
}
