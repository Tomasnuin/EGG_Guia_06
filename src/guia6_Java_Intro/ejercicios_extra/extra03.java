/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios_extra;

import java.util.Scanner;

/**
 * 3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
 * función equals() o startsWith() de la clase String.
 *
 */
public class extra03 {

    public static void esVocal() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra.");
        String letra = leer.next();
        if (letra.startsWith("a")
            || letra.startsWith("e")
            || letra.startsWith("i")
            || letra.startsWith("o")
            || letra.startsWith("u")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }
    }
}
