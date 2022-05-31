/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/**
 * 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class e04 {

    public static void celciusFahrenheit() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en °C:");
        int temperatura = leer.nextInt();

        temperatura = 32 + (temperatura * 9 / 5);

        System.out.println("La temperatura en °F es de °F" + temperatura);
    }
}
