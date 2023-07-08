package Ejercicio5Extra;

import java.util.Scanner;

public class MesesService {
    /*Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto.*/

    public Meses crearObjeto() {
        Meses m1 = new Meses();
        int num = (int) (Math.random() * m1.getMes().length);
        m1.setMesSecreto(m1.getMes()[num]);
        return m1;
    }

    public void encontrarMes(Meses mes) {
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Adivine el mes secreto. Introduzca el mes en minusculas");
            String respuesta = read.nextLine();

            if (respuesta.equalsIgnoreCase(mes.getMesSecreto())) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        } while (true);
    }
}
