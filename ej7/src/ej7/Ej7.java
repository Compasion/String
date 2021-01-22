/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class Ej7 {
    
//**********************************Métodos************************************    
    static String formatearTlf(String num) {
        //Variables
        String formateado = "";

        //Inicio
        formateado = "(+" + num.substring(0, 2) + ")-" + num.substring(2, 5) + "-" + num.substring(5, num.length());
        return formateado;
    }

    /*************************************************************************
     * *********************************Principal*****************************
     *************************************************************************/
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        String num;
        String tlfFormato;
        
        //Inicio
//        System.out.print("Dame un número de teleéfono --> ");
//        num = sc.nextLine();
//        tlfFormato = formatearTlf(num);
//        System.out.println(tlfFormato);
        char letra=' ';
        letra++;
        System.out.println(letra);
    }

}
