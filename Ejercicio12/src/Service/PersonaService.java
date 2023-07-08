/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {
   Scanner scanner = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona persona1 = new Persona();
        //System.out.println("Ingresa el nombre de la persona");
        //persona1.setNombre(leer.nextLine());
        System.out.println("Ingrese el nombre de la persona");
        persona1.setNombre(scanner.nextLine());
        System.out.println("Ingrese el dia");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el anio");
        int anio = scanner.nextInt();
        
        /*crear fecha con valors ingresados x el usuario*/
        Date fechaNacimiento = new Date(anio - 1900, mes, dia);
        scanner.nextLine();
            
        return persona1;
    }
    
    public int calcularEdad(Persona persona1, Date fechaNacimiento){
       /*obtener fecha actual*/
        Date fechaActual = new Date(); 
        
       /*calcular edad*/
        int diferenciaAnios = fechaActual.getYear() - fechaNacimiento.getYear();
        persona1.setDiferenciaAnios(scanner.nextInt());
        
        /*mostrar diferencia*/
        
        System.out.println("Diferencia de anios: " + diferenciaAnios);
        
        return diferenciaAnios;
    }
    
    public boolean menorQue(Persona persona1, int diferenciaAnios, int edad){
        System.out.println("Ingresa una edad");
        persona1.setEdad(scanner.nextInt());
        
        if(persona1.getDiferenciaAnios() > persona1.getEdad()){
           return true;
        }else{
          return  false;
        }
        
    }
    
    public void mostrarPersona(Persona persona1){
        System.out.println(crearPersona());
        System.out.println(calcularEdad());
        System.out.println(menorQue());
        
    } 
}
