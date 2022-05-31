
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios_extra;

import java.util.Scanner;

/**
 * 8. Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 */
public class extra08 {

    public static void ContadorNumTotalParImpar() {
        Scanner leer = new Scanner(System.in);

        int total = 0, pares = 0, impares = 0, usuario = -1;

        while (usuario % 5 != 0) {
            System.out.println("Ingrese un número entero, para terminar ingrese un mltiplo de 5.");
            usuario = leer.nextInt();
            total++;

            switch (usuario % 2) {
                case 0:
                    pares++;
                    break;
                case 1:
                    impares++;
                    break;
                default:
                    System.out.println("ERROR.");
                    break;
            }
        }

        System.out.println("Se han terminado de ingresar los números: \n"
                + "Total ingresados: " + total + " \n"
                + "Pares: " + pares + " \n"
                + "Impares: " + impares + " \n"
        );
    }
}
