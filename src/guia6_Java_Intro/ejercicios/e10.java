/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;
/**
 * 10. Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 */
public class e10 {

    public static void sumaHastaLimite() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indique el valor del límite, este debe ser positivo.");
        double limite, suma = 0;
        do {
        limite = leer.nextDouble();
            if (limite < 0) {
                System.out.println("El valor del límite debe ser positivo.");
            }
        } while ( limite < 0);
        
        System.out.println("Ahora ingrese valores hasta que\n"
                         + " su suma supere el limite:");
        
        while( suma <= limite ){
            System.out.println("El limite es :" + limite 
                             + "\nLa suma de los valores ingresados es: " + suma);
            suma += leer.nextDouble();
        }
        
        System.out.println("¡El límite fue superado!\n"
                         + "Límite: " + limite 
                         + "\nSuma: " + suma);
    }
}
