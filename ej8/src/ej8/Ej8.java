package ej8;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class Ej8 {

    /**
     * ************************************************************************
     * Metodos
     ************************************************************************
     */
    static void calcularFrecuencia(String cad, int vocales[]) {

        cad = cad.toLowerCase();
        for (int j = 0; j < cad.length(); j++) {
            if (cad.charAt(j) == 'a') {
                vocales[0]++;
            }
            if (cad.charAt(j) == 'e') {
                vocales[1]++;
            }
            if (cad.charAt(j) == 'i') {
                vocales[2]++;
            }
            if (cad.charAt(j) == 'o') {
                vocales[3]++;
            }
            if (cad.charAt(j) == 'u') {
                vocales[4]++;
            }
        }

    }
//-----------------------------------------------------------------------------

    static void mostrarFrecuencia(int vocales[]) {
        //Variables
        int i = 0;
        int cont2;
        int cont;

        //Inicio
        while (i < vocales.length) {
            cont2 = 1;
            cont = vocales[i];
            if (i == 0) {
                System.out.print("a " + vocales[0]);
            }
            if (i == 1) {
                System.out.print("e " + vocales[1]);
            }
            if (i == 2) {
                System.out.print("i " + vocales[2]);
            }
            if (i == 3) {
                System.out.print("o " + vocales[3]);
            }
            if (i == 4) {
                System.out.print("u " + vocales[4]);
            }
            while (cont2 <= cont) {
                System.out.print(" *");
                cont2++;
            }
            System.out.println(" ");
            i++;
        }
    }

//------------------------------------------------------------------------------    
//*******************Principal*************************************************
//------------------------------------------------------------------------------    
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int vocales[] = new int[5];
        String cad;

        //Inicio
        System.out.print("Dame una cadena: ");
        cad = sc.nextLine();
        calcularFrecuencia(cad, vocales);
        mostrarFrecuencia(vocales);
    }

}
