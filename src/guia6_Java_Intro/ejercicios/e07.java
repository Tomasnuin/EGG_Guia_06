/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/**
 * 7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
 * Incorrecto. Nota: investigar la función equals() en Java.
 */
public class e07 {

    public static void fraseEureka() {

        Scanner leer = new Scanner(System.in);

        System.out.println(
                "¿Cual es la palabra secreta?\n"
                + "Pista: Arquímedes de Siracusa");
        String frase = leer.nextLine();

        if ("eureka".equals(frase.toLowerCase())) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }

    }
}
