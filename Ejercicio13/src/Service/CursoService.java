/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;
import Entidad.Curso;
import java.util.Arrays;
/**
 *
 * @author Usuario
 */
public class CursoService {
    Scanner scanner = new Scanner(System.in);
    
    public int[] cargarAlumnos(){
        int[] alumnosClase = new int[5];
        for (int i = 0; i < alumnosClase.length; i++) {
            System.out.println("Ingresa el nombre del alumno");
            alumnosClase[i]=scanner.nextInt();   
        }
        
        return alumnosClase;
    }
    
    public Curso crearCurso(){
       Curso curso1 = new Curso();
        System.out.println("Ingresa el nombre del curso");
        curso1.setNombreCurso(scanner.nextLine());
        System.out.println("Ingresa la cantidad de horas por dia");
        curso1.setCantidadHorasPorDia(scanner.nextInt());
        System.out.println("Ingresa la cantidad de dias por semana");
        curso1.setCantidadDiasPorSemana(scanner.nextInt());
        System.out.println("Ingresa el turno del curso: mañana o tarde");
        curso1.setTurno(scanner.next());
        System.out.println("Ingresa el precio por hora");
        curso1.setPrecioPorHora(scanner.nextDouble());
        curso1.setAlumnos(cargarAlumnos());
        
        return curso1;
    }
    
    public void calcularGananciaSemanal(Curso curso1){
        double gananciaSemanal = curso1.getCantidadHorasPorDia() * curso1.getPrecioPorHora() * 5 * curso1.getCantidadDiasPorSemana();
        System.out.println("La ganancia semanal es de: " + gananciaSemanal);
    }
}
