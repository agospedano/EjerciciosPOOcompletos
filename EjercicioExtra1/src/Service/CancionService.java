
package Service;
import Entidad.Cancion;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CancionService {
    Scanner scanner = new Scanner (System.in);
    
    /*crear cancion*/
    public Cancion crearCancion(){
      Cancion cancion1 = new Cancion();
        System.out.println("Ingresa el nombre de la canción");
        cancion1.setTitulo(scanner.nextLine());
        System.out.println("Ingrese el autor de la canción");
        cancion1.setAutor(scanner.nextLine());
         
        return cancion1;
    }
    
    public void mostrarCancion(Cancion cancion1){
        System.out.println("Título: " + cancion1.getTitulo());
        System.out.println("Autor: " + cancion1.getAutor());
    
    }
}
