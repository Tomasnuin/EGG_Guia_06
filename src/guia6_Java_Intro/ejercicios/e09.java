/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/**
 * 9. Escriba un programa que pida una frase o palabra y valide si la primera
 * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se
 * deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y
 * equals() de Java.
 */
public class e09 {

    public static void primerLetraEsA() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase que empiece con 'A'.");
        
        if ( leer.nextLine().toUpperCase().charAt(0) == 'A' ) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto.");
        }
    }
}
