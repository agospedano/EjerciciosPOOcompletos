
package ejercicio5;
import Entidad.Cuenta;
import Service.CuentaService;
/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CuentaService cs = new CuentaService();
       Cuenta cuenta1 = cs.crearCuenta();
       cs.ingresar(0, cuenta1, 0);
       cs.retirar(cuenta1, 0, 0);
        
    }
    
}
