
package Service;
import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PuntosService {
   Scanner scanner = new Scanner(System.in);
   
   public Puntos crearPuntos(){
       Puntos punto1 = new Puntos();
       System.out.println("Ingresa un numero para la coordenada x1");
       punto1.setX1(scanner.nextInt());
       System.out.println("Ingresa otro numero para la coordenada x2");
       punto1.setX2(scanner.nextInt());
       System.out.println("Ingresa un numero para cooredenada y1");
       punto1.setY1(scanner.nextInt());
       System.out.println("Ingresa un numero para la coordenada y2");
       punto1.setX2(scanner.nextInt());
       return punto1;
   }
   
   public double calcularDistancia(Puntos punto1){
       int diferenciaX = punto1.getX2() - punto1.getX1();
       int diferenciaY = punto1.getY2() - punto1.getY1();
       
       double distancia = Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
       System.out.println("La distancia entre los dos puntos es: " + distancia);
       return distancia;
       
   }
   
   
}
