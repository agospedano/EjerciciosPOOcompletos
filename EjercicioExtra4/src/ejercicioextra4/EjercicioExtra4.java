
package ejercicioextra4;
import Entidad.NIF;
import Service.NifService;
/**
 *
 * @author Usuario
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifService ns = new NifService();
        NIF nif1 = ns.crearNif();
        ns.mostrar(nif1);
    }
    
    
    
}
