/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import static FuncMatrices.FuncMatrices.*;
import java.util.Scanner;

/**
 * 20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al
 * 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *    ↘ ↓
 *      2   7   6 
 *      + +
 *    → 9 + 5 + 1 = 15
 *      +     +
 *      4   3   8 
 *      ∥        ⑊
 *      15       15
 */
public class e20 {

    public static void esCuadradoMagico() {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        llenarMatriz(matriz, leer, 1, 9);
        imprimirMatriz(matriz, 3);
     
        comprobarCuadradoMagico(matriz, 3);
        // ej : 1 2 3 4 5 6 7 8 9 = falso
        // ej2: 2 7 6 9 5 1 4 3 8 = verdadero
    }
    
    public static void comprobarCuadradoMagico(int[][] m, int n){
        Boolean cuadradoMagico = true;
        int numMagico = (int) (n * (Math.pow(n, 2)+1)/2), aux = 0, aux2;
        System.out.println("Número mágico = " + numMagico);
        
        for (int i = 0; i < n; i++) {
            aux += m[i][i];
        }
        aux2 = aux;
        
        if (aux == numMagico) {
            for (int i = 0; i < n; i++) {
                if (aux == numMagico && aux2 == numMagico) {
                    aux = 0;
                    aux2 = 0;
                    for (int j = 0; j < n; j++) {
                        aux += m[i][j];
                        aux2 += m[j][i];
                    }
                } else {
                    cuadradoMagico = false;
                }
            }
        }
        
        if (cuadradoMagico)
            System.out.println("La matriz es un cuadrado mágico.");
        else
            System.out.println("La matriz no es un cuadrado mágico.");
    }
}
