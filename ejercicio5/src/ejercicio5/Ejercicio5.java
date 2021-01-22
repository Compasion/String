/*
 * la palabra mas larga
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author daw112
 */
public class Ejercicio5 {

    static String palabraMasLarga(String cad) {
        String palabraLarga = "";
        String aux = "";
        int posInicial = 0;
        int posicionActual = 0;

        while (posicionActual != -1) {
            posicionActual = cad.indexOf(' ', posInicial);
            if (posicionActual != -1) {
                aux = cad.substring(posInicial, posicionActual);
                posInicial = posicionActual + 1;
            }
            if (palabraLarga.length() < aux.length()) {
                palabraLarga = aux;
            }
        }

        aux = cad.substring(posInicial, cad.length());

        if (palabraLarga.length() < aux.length()) {
            palabraLarga = aux;
        }

        return palabraLarga;
    }

    static int contarCaracteres(String palabraLarga) {
        int nCaracteres = 0;
        nCaracteres = palabraLarga.length();
        return nCaracteres;
    }

    public static void main(String[] args) {
        // variables
        String cad, palabraLarga;
        int nCaracteres;
        Scanner escaner = new Scanner(System.in);

        // inicio
        System.out.println("Dime la cadena");
        cad = escaner.nextLine();
        palabraLarga = palabraMasLarga(cad);
        nCaracteres = contarCaracteres(palabraLarga);
        System.out.println("La palabra mas larga de esa cadena es: " + palabraLarga + " con " + nCaracteres + " letras.");
        // fin

    }

}
