
package ejercicio14;
import Entidad.Movil;
import Service.MovilService;
/**
 *
 * @author Usuario
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MovilService ms = new MovilService();
      Movil movil1 = ms.cargarCelular();
      System.out.println(movil1.toString());
    }
    
}
