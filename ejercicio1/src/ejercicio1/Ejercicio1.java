/*
 * comparar cadenas
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author daw112
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // variables
        String cad1, cad2;
        int compararAlf;
        Scanner escaner = new Scanner(System.in);
        //inicio
        System.out.println("Dime la cadena 1");
        cad1 = escaner.nextLine();
        System.out.println("Dime la cadena 2");
        cad2 = escaner.nextLine();
        //comparar en longitud
        if (cad1.length() > cad2.length()) {
            System.out.println(cad1 + " es mayor en longitud");
        } else if (cad1.length() < cad2.length()) {
            System.out.println(cad2 + " es mayor en longitud");
        } else {
            System.out.println("Las cadenas son iguales en longitud");
        }
        //comparar alfabeticamente
        compararAlf = cad1.compareTo(cad2);
        if (compararAlf < 0) {
            System.out.println(cad1 + " es menor alfabeticamente hablando");
        } else if (compararAlf > 0) {
            System.out.println(cad2 + " es menor alfabeticamente hablando");
        } else {
            System.out.println("las cadenas son iguales  alfabeticamente hablando");
        }
    }
}
