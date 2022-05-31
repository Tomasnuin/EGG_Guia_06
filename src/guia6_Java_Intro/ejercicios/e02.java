/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/* 
 * 2. Escribir un programa que pida tu nombre, lo guarde en una variable y
 * lo muestre por pantalla.
 */
public class e02 {

    public static void imprimirNombre() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();

        System.out.println("Su nombre es " + nombre);
    }
}
