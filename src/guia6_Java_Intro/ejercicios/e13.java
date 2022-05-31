/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/**
 * 13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
 * cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 * 
 *      ****
 *      *  *
 *      *  *
 *      ****
 * 
 */
public class e13 {

    public static void cuadradoAsterisco() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el tamaño del lado del cuadrado.");
        
        int lado = leer.nextInt();
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || j == 0 ||  i == lado-1) {
                    System.out.print("* ");
                } else if ( j == lado-1) {
                    System.out.print("*");
                }  else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
