/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios_extra;

import java.util.Scanner;

/**
 * 4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
 * muestre su equivalente en romano.
 */
public class extra04 {

    public static void numRomano() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entre el 1 y el 10:");
        int num = leer.nextInt();
        while (num < 1 || num > 10) {
            System.out.println("ERROR: numero fuera de rango.");
            System.out.println("Ingrese un numero entre el 1 y el 10:");
            num = leer.nextInt();
        }
        switch (num) {
            case 1:
                System.out.println(num + " = I");
                break;
            case 2:
                System.out.println(num + " = II");
                break;
            case 3:
                System.out.println(num + " = III");
                break;
            case 4:
                System.out.println(num + " = IV");
                break;
            case 5:
                System.out.println(num + " = V");
                break;
            case 6:
                System.out.println(num + " = VI");
                break;
            case 7:
                System.out.println(num + " = VII");
                break;
            case 8:
                System.out.println(num + " = VIII");
                break;
            case 9:
                System.out.println(num + " = IX");
                break;
            case 10:
                System.out.println(num + " = X");
                break;
            default:
        }
    }
}
