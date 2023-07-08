
package Service;
import Entidad.NIF;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class NifService {
    Scanner scanner = new Scanner(System.in);
    
    /*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le 
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el 
resultado del calculo. */
    
    public NIF crearNif(){
        NIF nif1 = new NIF();
        System.out.println("Ingresa el DNI");
        nif1.setDni(scanner.nextLong());
        
        int resto = (int) (nif1.getDni() % 23);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraCalculada = letras.charAt(resto);
        nif1.setLetra(letraCalculada);
        
        return nif1;
    }
    
    public void mostrar(NIF nif1){
        String nif = String.format("%08d", nif1.getDni()) + "-" + nif1.getLetra();
        System.out.println("NIF: " + nif);
    }
    
}
