
package ejercicioextra1;
import Entidad.Cancion;
import Service.CancionService;
/**
 *
 * @author Usuario
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CancionService cs = new CancionService();
        Cancion cancion1 = cs.crearCancion();
        cs.mostrarCancion(cancion1);
    }
    
}
