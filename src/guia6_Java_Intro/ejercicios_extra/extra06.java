/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios_extra;

import java.util.Scanner;

/**
 * 6. Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class extra06 {

    public static void promedioEstaturas() {
        Scanner leer = new Scanner(System.in);
        int total = 0, menorQue160 = 0, estatura = 0;
        double estaturaMen160 = 0, estaturaTotal = 0;

        System.out.println("Ingresar estatura de las personas, "
                + "ingrese -1 para terminar: ");
        while (estatura >= 0) {
            System.out.println("Persona #" + total + ":");
            estatura = leer.nextInt();
            if (estatura < 160 && estatura != -1) {
                menorQue160++;
                estaturaMen160 += estatura;
            }
            if (estatura != -1) {
                total++;
                estaturaTotal += estatura;
            }
        }

        if (menorQue160 == 0) {
            System.out.println("El promedio de personas con estatura "
                    + "menor que 1.60mts es 0.");
        } else {
            System.out.println("El promedio de personas con estatura "
                    + "menor que 1.60mts es " + estaturaMen160 / menorQue160 + ".");
        }
        if (total == 0) {
            System.out.println("El promedio de estatura de todas las personas es 0.");
        } else {
            System.out.println("El promedio de estatura de todas las personas es " 
                    + estaturaTotal / total + ".");
        }
    }
}
