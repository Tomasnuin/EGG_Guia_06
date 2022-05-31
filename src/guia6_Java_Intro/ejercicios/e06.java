/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/**
 * 6. Crear un programa que dado un numero determine si es par o impar.
 */
public class e06 {

    public static void parOImpar() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número.");

        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }
    }
}
