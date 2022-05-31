/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import static FuncMatrices.FuncMatrices.*;

/**
 * 18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 *
 * 1 0 4 1 0 6
 * Matriz A = 0 5 0 -> Matriz B = 0 5 0 6 0 -9 4 0 -9
 *
 */
public class e18 {

    public static void matrizTranspuesta4x4() {

        int n = 4;
        int[][] matriz = new int[n][n];

        llenarMatriz(matriz, -100, 100);
        imprimirMatriz(matriz, n);

        imprimirMatrizTranspuesta(matriz, n);

    }

    public static void imprimirMatrizTranspuesta(int[][] m, int n) {
        System.out.println("MatrizTranspuesta[" + n + "][" + n + "] =");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Le da un formato mas lindo, se rompe a partir de 10000
                if (m[j][i] < 0) {

                    if (Math.abs(m[j][i]) < 10) {
                        System.out.print("    ");
                    } else if (Math.abs(m[j][i]) < 100) {
                        System.out.print("   ");
                    } else if (Math.abs(m[j][i]) < 1000) {
                        System.out.print("  ");
                    } else if (Math.abs(m[j][i]) < 10000) {
                        System.out.print(" ");
                    } // max 1000000000 hacer despues
                } else {
                    if (m[j][i] < 10) {
                        System.out.print("     ");
                    } else if (m[j][i] < 100) {
                        System.out.print("    ");
                    } else if (m[j][i] < 1000) {
                        System.out.print("   ");
                    } else if (m[j][i] < 10000) {
                        System.out.print("  ");
                    } // max 1000000000 hacer despues
                }

                System.out.print(m[j][i]);
            }
            System.out.println("");
        }
    }
}
