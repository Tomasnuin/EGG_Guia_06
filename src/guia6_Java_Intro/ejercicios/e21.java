/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import static FuncMatrices.FuncMatrices.*;
import java.util.Scanner;

/**
 * 21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y
 * la matriz P de 3x3, se solicita escribir un programa en el cual se compruebe
 * si la matriz P está contenida dentro de la matriz M. Para ello se debe
 * verificar si entre todas las submatrices de 3x3 que se pueden formar en la
 * matriz M, desplazándose por filas o columnas, existe al menos una que
 * coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
 * columna de la matriz M en la cual empieza el primer elemento de la submatriz
 * P. Ejemplo:
 *
 *          Matriz de 10x10               
 *   1  26  36  47   5   6  72  81  95  10
 *  11  12  13  21  41  22  67  20  10  61 
 *  56  78  87  90   9  90  17  12  87  67
 *  41  87  24  56  97  74  87  42  64  35
 *  32  76  79   1  36   5  67  96  12  11
 *  99  13  54  88  89  90  75  12  41  76
 *  67  78  87  45  14  22  26  42  56  78
 *  98  45  34  23  32  56  74  16  19  18
 *  24  67  97  46  87  13  67  89  93  24
 *  21  68  78  98  90  67  12  41  65  12
 * 
 *           Matriz de 3x3
 *            36   5   67 
 *            89  90   75
 *            14  22   26
 * 
 * Como podemos observar nuestra submatriz P se encuentra en la matriz M en los
 * índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */

public class e21 {
  
    public static void buscarMatriz3x3EnMatriz10x10() {
        
        int[][] matriz10x10 = new int[10][10];
        int[][] matriz3x3 = new int[3][3];
        llenarMatriz(matriz10x10, 0, 1);
        llenarMatriz(matriz3x3, 0, 1);
        
        /* Prueba para saber si funciona
        Scanner leer = new Scanner(System.in);
        llenarMatriz(matriz10x10, leer);
        llenarMatriz(matriz3x3, leer);
        
        * Input:
        ej1, la matriz se encuentra en (7,7):
        1  26  36  47   5   6  72  81  95  10
        11  12  13  21  41  22  67  20  10  61
        56  78  87  90   9  90  17  12  87  67
        41  87  24  56  97  74  87  42  64  35
        32  76  79   1  36   5  67  96  12  11
        99  13  54  88  89  90  75  12  41  76
        67  78  87  45  14  22  26  42  56  78
        98  45  34  23  32  56  74   0   0   0
        24  67  97  46  87  13  67   0   1   0
        21  68  78  98  90  67  12   0   0   4
        0   0   0
        0   1   0
        0   0   4
        */
        imprimirMatriz(matriz10x10, 10);
        imprimirMatriz(matriz3x3, 3);
        
        buscar3x3en10x10(matriz3x3, matriz10x10);
    }

    private static void buscar3x3en10x10(int[][] m3x3, int[][] m10x10) {
        int startI = -1, startJ = -1;
        Boolean encontrado = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (m10x10[i][j] == m3x3[0][0]) {
                    if (!encontrado) {
                        startI = i;
                        startJ = j;
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 3; l++) {
                                if (m10x10[i + k][j + l] == m3x3[k][l]) {
                                    encontrado = true;
                                } else {
                                    encontrado = false;
                                    k = 4;
                                    l = 4;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (encontrado) {
            System.out.println("Encontrado en (" + startI + ", " + startJ + ")");
        } else {
            System.out.println("La matriz 3x3 no se encuentra dentro de la matriz 10x10.");
        }

    }
}
