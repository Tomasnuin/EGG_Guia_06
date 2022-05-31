/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/**
 *
 * 5. Escribir un programa que lea un número entero por teclado y muestre por
 * pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
 * investigar la función Math.sqrt().
 *
 *
 */
public class e05 {

    public static void dobleTripleRaiz() {
        Scanner leer = new Scanner(System.in);

        System.out.println(
                "Ingresar un número.");

        int num = leer.nextInt();

        System.out.println(
                "El doble de " + num + " es " + num * 2 + "\n"
                + "El triple de " + num + " es " + num * 3 + "\n"
                + "La raiz cuadrada de " + num + " es " + Math.sqrt(num) + "\n");
    }
}
