/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import static FuncVectores.FuncVectores.*;
import java.util.Scanner;

/**
 * 16. Realizar un algoritmo que rellene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un numero a buscar en el vector. El programa
 * mostrará donde se encuentra el numero y si se encuentra repetido
 */
public class e16 {

    public static void buscarVector() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector:");
        int n = leer.nextInt();
        int[] vector = new int[n];

        initVectorRand(vector, 0, 100);
        imprimirVector(vector);

        System.out.println("Ingresar el valor a buscar:");
        int elem = leer.nextInt();
        int conteo = buscarEnVector(elem, vector);

        if (conteo == 0) {
            System.out.println(elem + " no se encuentra en el vector.");
        } else {
            System.out.println("La cantidad de veces que " + elem + " fue encontrado es " + conteo);
        }
    }

    public static int buscarEnVector(int elem, int[] v) {
        int conteo = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == elem) {
                conteo++;
            }
        }
        return conteo;
    }
}
