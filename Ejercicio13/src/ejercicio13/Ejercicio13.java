
package ejercicio13;
import Entidad.Curso;
import Service.CursoService;
/**
 *
 * @author Usuario
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso curso1 = cs.crearCurso();
        cs.calcularGananciaSemanal(curso1);
    }
    
}
