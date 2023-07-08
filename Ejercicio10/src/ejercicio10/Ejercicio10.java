
package ejercicio10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear arreglo A de 50 números reales
        double[] arregloA = new double[50];
        
        // Inicializar arreglo A con números aleatorios
        Random random = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextDouble();
        }
        
        // Mostrar arreglo A por pantalla
        System.out.println("Arreglo A original:");
        System.out.println(Arrays.toString(arregloA));
        
        // Ordenar arreglo A de menor a mayor
        Arrays.sort(arregloA);
        
        // Crear arreglo B de 20 números reales
        double[] arregloB = new double[20];
        
        // Copiar los primeros 10 números ordenados de arreglo A a arreglo B
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        
        // Rellenar los 10 últimos elementos de arreglo B con el valor 0.5
        Arrays.fill(arregloB, 10, 20, 0.5);
        
        // Mostrar los arreglos resultantes por pantalla
        System.out.println("Arreglo A ordenado:");
        System.out.println(Arrays.toString(arregloA));
        
        System.out.println("Arreglo B combinado:");
        System.out.println(Arrays.toString(arregloB));
    }
   }
   
