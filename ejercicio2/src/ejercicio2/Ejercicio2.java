/*
 * invirtir una cadena
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author daw112
 */
public class Ejercicio2 {

    static String invertidorCadenas(String cad) {
        String resultado = "";
        int longitudCadena = cad.length() - 1;
        while (longitudCadena >= 0) {
            resultado = resultado + cad.charAt(longitudCadena);
            longitudCadena--;
        }
        return resultado;
    }

    public static void main(String[] args) {
        // variables
        String cad, resultado;
        Scanner escaner = new Scanner(System.in);
        //inicio
        System.out.println("Dime la cadena");
        cad = escaner.nextLine();
        resultado = invertidorCadenas(cad);
        System.out.println(resultado);
        //fin
    }

}
