/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Ejer4 {
    
    static int contarLetras(String frase, char letra) {
        int cont;
        cont = 0;
        int lugar;
        lugar = 0;
        
        int intIndex = 0;
        
        do {
            intIndex = frase.indexOf(letra, intIndex);
            if (intIndex >= 0) {
                cont++;
                intIndex += 1;
                //intIndex = intIndex + 1;
            } 
        } while (intIndex >= 0);
        return cont;
        
    }
    
    static int contarLetrasString6(String frase, String letra) {
        int cont;
        cont = 0;
        int lugar;
        lugar = 0;
        
        int intIndex = 0;
        
        do {
            intIndex = frase.indexOf(letra, intIndex);
            if (intIndex >= 0) {
                cont++;
                intIndex += 1;
                //intIndex = intIndex + 1;
            } 
        } while (intIndex >= 0);
        return cont;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cuanta;
        System.out.println("Dime una frase");
        String frase = sc.nextLine();
        System.out.println("Dime que quieres buscar");
        //char letra = sc.nextLine().charAt(0);
        String sub = sc.nextLine();

        //cuanta = contarLetras(frase.toLowerCase(), letra);
        cuanta = contarLetrasString6(frase, sub);
        
        if (cuanta >= 1) {
            System.out.println("Se ha encontrado " + cuanta + " veces en '" + frase + "'");
            
        } else {
            System.out.println("No ha sido encontrado");
        }
    }
    
}
