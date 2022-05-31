/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import static FuncVectores.FuncVectores.*;
import java.util.Scanner;

/**
 * 17. Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class e17 {

    public static void vectorCantidadDigitosElemento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector:");
        int n = leer.nextInt();
        int[] vector = new int[n];

        initVectorRand(vector, 0, 1000000);
        imprimirVector(vector);
        contarDigitosVector(vector);
    }

    public static void contarDigitosVector(int[] v) {
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 10 == v[i]) {
                d1++;
            } else if (v[i] % 100 == v[i]) {
                d2++;
            } else if (v[i] % 1000 == v[i]) {
                d3++;
            } else if (v[i] % 10000 == v[i]) {
                d4++;
            } else if (v[i] % 100000 == v[i]) {
                d5++;
            }
        }

        System.out.println(
                  "Proceso terminado:\n"
                + "Un digito = " + d1 + "\n"
                + "Dos digitos = " + d2 + "\n"
                + "Tres digitos = " + d3 + "\n"
                + "Cuatro digitos = " + d4 + "\n"
                + "Cinco digitos = " + d5 + "\n");
    }
}
