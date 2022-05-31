/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncMatrices;

import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class FuncMatrices {

    /**
     * imprimirMatriz.
     *
     * @param m Matriz
     * @param fil Filas
     * @param col Columnas
     *
     * Imprime en pantalla una matriz de N filas y M columnas.
     */
    public static void imprimirMatriz(int[][] m, int fil, int col) {
        System.out.println("Matriz[" + fil + "][" + col + "] =");
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {

                // Le da un formato mas lindo, se rompe a partir de 10000
                if (m[i][j] < 0) {

                    if (Math.abs(m[i][j]) < 10) {
                        System.out.print("    ");
                    } else if (Math.abs(m[i][j]) < 100) {
                        System.out.print("   ");
                    } else if (Math.abs(m[i][j]) < 1000) {
                        System.out.print("  ");
                    } else if (Math.abs(m[i][j]) < 10000) {
                        System.out.print(" ");
                    } // max 1000000000 hacer despues
                } else {
                    if (m[i][j] < 10) {
                        System.out.print("     ");
                    } else if (m[i][j] < 100) {
                        System.out.print("    ");
                    } else if (m[i][j] < 1000) {
                        System.out.print("   ");
                    } else if (m[i][j] < 10000) {
                        System.out.print("  ");
                    } // max 1000000000 hacer despues
                }

                System.out.print(m[i][j]);
            }
            System.out.println("");
        }

    }

    /**
     * imprimirMatriz.
     *
     * @param m Matriz
     * @param filCol Filas y columnas
     *
     * Imprime en pantalla una matriz de N filas y columnas.
     */
    public static void imprimirMatriz(int[][] m, int filCol) {
        System.out.println("Matriz[" + filCol + "][" + filCol + "] =");
        for (int i = 0; i < filCol; i++) {
            for (int j = 0; j < filCol; j++) {

                // Le da un formato mas lindo, se rompe a partir de 10000
                if (m[i][j] < 0) {

                    if (Math.abs(m[i][j]) < 10) {
                        System.out.print("    ");
                    } else if (Math.abs(m[i][j]) < 100) {
                        System.out.print("   ");
                    } else if (Math.abs(m[i][j]) < 1000) {
                        System.out.print("  ");
                    } else if (Math.abs(m[i][j]) < 10000) {
                        System.out.print(" ");
                    } // max 1000000000 hacer despues
                } else {
                    if (m[i][j] < 10) {
                        System.out.print("     ");
                    } else if (m[i][j] < 100) {
                        System.out.print("    ");
                    } else if (m[i][j] < 1000) {
                        System.out.print("   ");
                    } else if (m[i][j] < 10000) {
                        System.out.print("  ");
                    } // max 1000000000 hacer despues
                }

                System.out.print(m[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    /**
     * llenarMatriz.
     *
     * @param m Matriz
     * @param min Cota superior
     * @param max Cota inferior
     *
     * Llena la matriz con números aleatorios desde el mínimo hasta el máximo.
     * Recomiendo usar valores hasta 10000
     */
    public static void llenarMatriz(int[][] m, int min, int max) {
        for (int[] m1 : m) {
            for (int i = 0; i < m.length; i++) {
                m1[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
            }
        }
    }

    /**
     * llenarMatriz.
     *
     * @param m Matriz.
     * @param scan Scanner.
     *
     * Llena la matriz con enteros ingresados por el usuario.
     */
    public static void llenarMatriz(int[][] m, Scanner scan) {
        for (int[] m1 : m) {
            for (int i = 0; i < m.length; i++) {
                m1[i] = scan.nextInt();
            }
        }
    }

    /**
     * llenarMatriz.
     *
     * @param m Matriz.
     * @param scan Scanner.
     * @param min Cota inferior.
     * @param max Cota superior.
     *
     * Llena la matriz con enteros ingresados por el usuario que se encuentren
     * entre la cota inferior y superior
     */
    public static void llenarMatriz(int[][] m, Scanner scan, int min, int max) {
        int elem;
        for (int[] m1 : m) {
            for (int i = 0; i < m.length; i++) {
                System.out.println("Ingresar entero entre " + min + " y " + max + ":");
                elem = scan.nextInt();
                while (elem < min || elem > max) {
                    System.out.println("Error, valores aceptados entre 1 y 9.");
                    elem = scan.nextInt();
                }
                m1[i] = elem;
            }
        }
    }
}
