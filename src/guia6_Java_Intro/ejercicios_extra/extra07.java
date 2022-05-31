/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios_extra;

import java.util.Scanner;

/**
 * 7. Realice un programa que calcule y visualice el valor máximo, el valor
 * mínimo y el promedio de n números (n>0). El valor de n se solicitará al
 * principio del programa y los números serán introducidos por el usuario.
 * Realice dos versiones del programa, una usando el bucle “while” y otra con el
 * bucle “do - while”.
 */
public class extra07 {

    public static void maxMinPromDosFormas() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números.");
        int num = leer.nextInt();

        while(num <= 0){
            System.out.println("ERROR: debe ingresar un número mayor que 0.");
        }
        
        System.out.println("Version con bucle \"while\":");
        formaWhile(leer, num);
        System.out.println("Version con bucle \"do while\":");
        formaDoWhile(leer, num);
    }

    public static void formaWhile(Scanner read, int n) {
        int max = 0, min = 0, aux, sum = 0, i = 1;
        double promedio;
        
        while (i <= n) {
            System.out.print("Num #" + i + ":");
            aux = read.nextInt();

            if (i == 1) {
                max = aux;
                min = aux;
            } else {
                if (aux < min) {
                    min = aux;
                }
                if (aux > max) {
                    max = aux;
                }
            }

            sum += aux;
            i++;
        }
        promedio = sum / n;
        
        System.out.println("Máximo: " + max + "\n"
                + "Mínimo: " + min + "\n"
                + "Promedio: " + promedio + "");

    }

    public static void formaDoWhile(Scanner read, int n) {
        int max = 0, min = 0, aux, sum = 0, i = 1;
        double promedio;
        
        do {
            System.out.print("Num #" + i + ":");
            aux = read.nextInt();

            if (i == 1) {
                max = aux;
                min = aux;
            } else {
                if (aux < min) {
                    min = aux;
                }
                if (aux > max) {
                    max = aux;
                }
            }

            sum += aux;
            i++;
        } while (i <= n);

        promedio = sum / n;
        System.out.println("Máximo: " + max + "\n"
                + "Mínimo: " + min + "\n"
                + "Promedio: " + promedio + "");
    }
}
