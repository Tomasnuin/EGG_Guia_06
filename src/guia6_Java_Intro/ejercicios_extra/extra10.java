/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios_extra;

import java.util.Scanner;

/**
 * 10. Realice un programa para que el usuario adivine el resultado de una
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10. El
 * programa debe indicar al usuario si su respuesta es o no correcta. En caso
 * que la respuesta sea incorrecta se debe permitir al usuario ingresar su
 * respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
 * la función Math.random() de Java.
 */
public class extra10 {

    public static void AdivinarResultadoMultiplicacion() {
        Scanner leer = new Scanner(System.in);

        int rand = (int) (Math.floor(Math.random() * (10 + 1))
                * Math.floor(Math.random() * (10 + 1)));
        // System.out.println("rand = " + rand);

        int usuario;

        System.out.println("Adivina el número.\n"
                + "Pista: el número es el resultado de multiplicar 2 numeros \n"
                + "aleatorios entre 0 y 10");

        do {
            usuario = leer.nextInt();

            if (usuario != rand) {
                System.out.println("Ese no es el número. Ingrese otro.");
            }
        } while (usuario != rand);

        System.out.println("¡Felicitaciones, lo adivinaste!");

    }
}
