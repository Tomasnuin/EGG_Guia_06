/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios_extra;

import java.util.Scanner;

/**
 * 1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
 * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
 * equivalente: 1 día, 2 horas.
 */
public class extra01 {

    public static void minutosADiasHoras() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos:");
        int min = leer.nextInt();

        int dias = (int) (min / 60) / 24;

        int horas = (int) (min / 60) - dias * 24;

        System.out.println(min + " minutos = " + dias + " dias " + horas + " horas ");
    }
}
