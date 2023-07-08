/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VehiculoService {
    Scanner leer = new Scanner(System.in);
    
    /*crear vehiculo*/
    public Vehiculo crearVehiculo(){
        Vehiculo vehiculo1 = new Vehiculo();
        System.out.println("Ingresa la marca del vehiculo");
        vehiculo1.setMarca(leer.nextLine());
        System.out.println("Ingrese el modelo del vehiculo");
        vehiculo1.setModelo(leer.nextLine());
        System.out.println("Ingrese el anio del vehiculo");
        vehiculo1.setAnio(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el tipo de vehiculo");
        vehiculo1.setTipo(leer.nextLine());
        
        return vehiculo1;
    }
    
    /*metodo moverse*/
    public void moverse(float segundos, Vehiculo objeto1){
        
        switch(objeto1.getTipo()){
            case "automovil":
                System.out.println(segundos * 3);
                objeto1.setCantidadMetros(segundos*3);
                break;
            case "motocicleta":
                System.out.println(segundos * 2);
                objeto1.setCantidadMetros(segundos*2);
                break;    
            case "bicicleta":
                System.out.println(segundos);
                objeto1.setCantidadMetros(segundos);
                break;
                
        }

    }
        
    public void frenar(Vehiculo objeto1){
        switch(objeto1.getTipo()){
            case "automovil":
                System.out.println(objeto1.getCantidadMetros() + 2);
                break;

            case "motocicleta":
                System.out.println(objeto1.getCantidadMetros() + 2);
                break;
                
                
            case "bicicleta":
                System.out.println(objeto1.getCantidadMetros());
                break;
        }
        
        
    }
    
}
