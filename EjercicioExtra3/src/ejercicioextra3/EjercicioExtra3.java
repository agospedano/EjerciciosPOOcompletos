
package ejercicioextra3;
import Entidad.Raices;
import Service.RaicesService;
/**
 *
 * @author Usuario
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesService rs = new RaicesService();
        Raices ecuacion1 = rs.crearEcuacion();
        rs.getDiscriminante(ecuacion1);
        rs.tieneRaices(ecuacion1);
        rs.tieneRaiz(ecuacion1);
        rs.obtenerRaices(ecuacion1);
        rs.obtenerRaiz(ecuacion1);
    }
    
}
