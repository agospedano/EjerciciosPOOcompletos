package Ejercicio8OOP.Service;

import Ejercicio8OOP.Cadena.Cadena;

public class CadenaService {
    Cadena c1 = new Cadena();

    public void mostrarVocales(Cadena c1) {
        int contA = 0, contE=0, contI=0, contO=0, contU=0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            String letra = c1.getFrase().substring(i, i + 1).toUpperCase();


        }

    }


    public void invertirFrase() {

    }

        /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
 */
    
    public String vecesRepetido (String letra){
        char carcaterIngresado;
        int i, totalRepetida;
        System.out.println("Ingrese un caracter");
        char carcaterIngresado = leer.nextChar();

        for(i=0;c1.getLongitud()){
            if(substring(frase, i, i)==carcaterIngresado){
                totalRepetida = totalRepetida + 1;
            }
            System.out.println("El caracter ingresado ser repite " + totalRepetida + " veces.")
        return totalRepetida;
        }
    

}
}
