/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/*
 * 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
 * después toda en minúsculas.
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class e03 {

    public static void fraseMayusMinus() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String nombre = leer.nextLine();

        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
    }
}
