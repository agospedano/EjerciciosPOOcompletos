
package Service;
import Entidad.Raices;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class RaicesService {
    Scanner scanner = new Scanner(System.in);
    
    /*crear ecuacion*/
    public Raices crearEcuacion(){
        Raices ecuacion1 = new Raices();
        /*System.out.println("Ingresa el coeficiente a");*/
        ecuacion1.setA(2);
        /*System.out.println("Ingresa el coeficiente b");*/
        ecuacion1.setB(-3);
        ecuacion1.setC(1);
        return ecuacion1;
    }
    
    public double getDiscriminante(Raices ecuacion1){
        
        double discriminante =  Math.pow(ecuacion1.getB(), 2) - 4 * ecuacion1.getA() * ecuacion1.getC();
        System.out.println("El discriminante es: " + discriminante);
        return discriminante;
    }
    
    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    
    public boolean tieneRaices(Raices ecuacion1){
       double discriminante = getDiscriminante(ecuacion1);
       if(discriminante>=0){
           System.out.println("La ecuación tiene dos soluciones.");
           return true;
       } else {
           System.out.println("La ecuación no tiene dos soluciones.");
           return false;
       }
    }
    
    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0.*/
    
    public boolean tieneRaiz(Raices ecuacion1){
        double discriminante = getDiscriminante(ecuacion1);
        if(discriminante == 0){
            System.out.println("Tiene una unica solución.");
            return true;
        } else {
            System.out.println("Tiene mas de una solución.");
            return false;
        }
    }
    
    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 
posibles soluciones. */
    public void obtenerRaices(Raices ecuacion1){
        if(tieneRaices(ecuacion1)){
          double discriminante = getDiscriminante(ecuacion1);
          double raiz1 = (-ecuacion1.getB() + Math.sqrt(discriminante)) / (2* ecuacion1.getA());
          double raiz2 = (-ecuacion1.getB() - Math.sqrt(discriminante)) / (2* ecuacion1.getA());
            System.out.println("Las soluciones de la ecuación son: ");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }
    
    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible. */
    public void obtenerRaiz(Raices ecuacion1){
        if (tieneRaiz(ecuacion1)){
            double discriminante = getDiscriminante(ecuacion1);
            double raiz = -ecuacion1.getB() / (2 * ecuacion1.getA());
            
            System.out.println("La unica raiz de la ecuacion es: " + raiz);
        }
    }
    
    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje. 
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo 
delante de -b */
    
    
    
}
