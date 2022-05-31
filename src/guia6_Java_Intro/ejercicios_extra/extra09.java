/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios_extra;

import java.util.Scanner;

/**
 * 9. Simular la división usando solamente restas. Dados dos números enteros
 * mayores que uno, realizar un algoritmo que calcule el cociente y el residuo
 * usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un
 * resultado menor que el divisor, este resultado es el residuo, y el número de
 * restas realizadas es el cociente.
 * Por ejemplo: 
 * 50 / 13: 
 * 50 – 13 = 37 una resta realizada 
 * 37 – 13 = 24 dos restas realizadas 
 * 24 – 13 = 11 tres restas realizadas 
 * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. 
 * ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
public class extra09 {

    public static void divisionManual() {
        Scanner leer = new Scanner(System.in);
        
        int dividendo, divisor, aux, cociente = 0;
        
        System.out.println("Ingrese 2 números mayores que 1, estos serán el \n"
                + "dividendo y el divisor.");
        do {
            System.out.println("Ingrese el dividendo:");
            dividendo = leer.nextInt();
            System.out.println("Ingrese el divisor:");
            divisor = leer.nextInt();

            if (dividendo < 1 || divisor < 1) {
                System.out.println("Error: debe ingresar un números mayores que 1.");
            }
        } while (dividendo < 1 || divisor < 1);

        aux = dividendo;

        while (dividendo >= divisor) {
            cociente++;
            dividendo -= divisor;
        }
        
        System.out.println(aux + " / " + divisor + " = " + cociente + "\n"
                + "Resto: " + dividendo);

    }
}
