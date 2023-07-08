package Ejercicio8OOP.Main;

import Ejercicio8OOP.Cadena.Cadena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadena c1 = new Cadena();

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una frase");
        c1.setFrase(scanner.next());
        c1.setLongitud(c1.getFrase().length());
    }
}
