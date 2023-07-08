
package Service;
import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MovilService {
   Scanner scanner = new Scanner(System.in); 
   
   public Movil cargarCelular(){
       Movil movil1 = new Movil();
        System.out.println("Ingresa la marca del movil");
        movil1.setMarca(scanner.nextLine());
        System.out.println("Ingresa el precio del movil");
        movil1.setPrecio(scanner.nextDouble());
        System.out.println("Ingresa el modelo del movil");
        movil1.setModelo(scanner.next());
        System.out.println("Ingresa la memoria RAM del movil");
        movil1.setMemoriaRam(scanner.nextInt());
        System.out.println("Ingresa el almacenamiento del movil");
        movil1.setAlmacenamiento(scanner.nextDouble());
        movil1.setCodigo(ingresarCodigo());
        return movil1;
    }
   
   /*Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/
   public int[] ingresarCodigo(){
       int[] codigo = new int[7];
       for(int i=0; i<7; i++){
           System.out.println("Ingresa un numero");
           codigo[i] = scanner.nextInt();
       }
       return codigo;
   } 
}
