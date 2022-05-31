/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import FuncVectores.*;

/**
 * 15. Realizar un algoritmo que rellene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 */
public class e15 {

    public static void vector100() {
        int[] vector = new int[100];

        for (int i = 100; i >= 1; i--) {
            vector[100 - i] = i - 1;
        }

        FuncVectores.imprimirVector(vector);
    }
}
