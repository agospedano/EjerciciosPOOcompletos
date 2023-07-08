
package ejercicio2extra;
import Entidad.Puntos;
import Service.PuntosService;
/**
 *
 * @author Usuario
 */
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosService ps = new PuntosService();
        Puntos punto1 = ps.crearPuntos();
        double calcularDistancia = ps.calcularDistancia(punto1);

    }
    
}
