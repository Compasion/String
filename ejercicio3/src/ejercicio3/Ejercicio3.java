/*
 * ejercicio 3
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author daw112
 */
public class Ejercicio3 {

    static int cuentaVocales(String cad){
        int resultado =0;
        char letraActual;

        for (int i = 0; i < cad.length(); i++) {
            letraActual = cad.charAt(i);
            if(letraActual== 'a' ||letraActual== 'A' || letraActual== 'e' 
                    ||letraActual== 'E'  || letraActual== 'i' ||letraActual== 'I' 
                    || letraActual== 'o' ||letraActual== 'O' || letraActual== 'u' ||letraActual== 'U'){
                resultado = resultado + 1;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        // variables
            String cad;
            int resultado;
            Scanner escaner = new Scanner(System.in);
        // inicio
            System.out.println("Dime tu cadena");
            cad = escaner.nextLine();
            resultado = cuentaVocales(cad);
            System.out.println("Esa cadena tiene: " + resultado + " vocales");
        // fin
    }
    
}
