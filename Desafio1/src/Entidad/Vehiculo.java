/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
   private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    private float cantidadMetros;
    
  
    
    /*constructor vacio*/
    public Vehiculo(){
        
    }
    /*constructor por parametro*/
    public Vehiculo(String marca, String modelo, int anio, String tipo, float cantidadMetros) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.cantidadMetros = cantidadMetros;
    }
    
    /*get and set*/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public float getCantidadMetros() {
        return cantidadMetros;
    }

    public void setCantidadMetros(float cantidadMetros) {
        this.cantidadMetros = cantidadMetros;
    }
     
}