/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/*
 * 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */
public class e01 {

    public static void sumarDosNumeros() {

        int num1, num2;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");

        num1 = leer.nextInt();
        num2 = leer.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
