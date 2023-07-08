
package desafio1;
import Entidad.Vehiculo;
import Service.VehiculoService;
/**
 *
 * @author Usuario
 */
public class Desafio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehiculoService vehiculoService = new VehiculoService();
        Vehiculo vehiculo1 = vehiculoService.crearVehiculo();
        vehiculoService.moverse(5, vehiculo1);
        vehiculoService.frenar(vehiculo1);
    }
    
}
