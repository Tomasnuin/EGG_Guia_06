/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import static FuncMatrices.FuncMatrices.*;
import java.util.Scanner;

/**
 * 19. Realice un programa que compruebe si una matriz dada es anti simétrica.
 * Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 * 
 *       Matriz              Matriz transpuesta
 *      0  -2   4               0   2  -4
 *      2   0   2              -2   0  -2
 *     -4  -2   0               4   2   0
 * 
 * En este caso la matriz es anti simétrica.
 */
public class e19 {

    public static void esMatrizAntiSimetrica() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar el numero de filas/columnas.");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];

        llenarMatriz(matriz, -10, 10);
        imprimirMatriz(matriz, n);

        imprimirTranspuesta(matriz, n);
        esAntiSimetrica(matriz, n);

        /*  Prueva: se modifica la matriz para asegurarse que sea transpuesta.
        
        hacerTranspuesta(matriz, n);
        imprimirMatriz(matriz, n);
        esAntiSimetrica(matriz, n);
        
         */
    }

    public static void esAntiSimetrica(int[][] m, int n) {
        Boolean transpuesta = true;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (m[i][j] != -m[j][i]) {
                    transpuesta = false;
                }
            }
        }

        if (transpuesta) {
            System.out.println("Esta matriz es anti simétrica.");
        } else {
            System.out.println("Esta matriz no es anti simétrica.");
        }
    }

    public static void imprimirTranspuesta(int[][] m, int n) {
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

    public static void llenarMatriz(int[][] m, int min, int max) {
        for (int[] m1 : m) {
            for (int i = 0; i < m.length; i++) {
                m1[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
            }
        }
    }

    /**
     * hacerTranspuesta.
     *
     * @param m Matriz.
     * @param n Filas y columnas.
     *
     * Usar esta función para verificar que la funcion esAntiSimetrica funciona.
     */
    public static void hacerTranspuesta(int[][] m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (j == i) {
                    m[j][i] = 0;
                } else {
                    m[j][i] = -m[i][j];
                }
            }
        }
    }
}
