/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 14. Crea una aplicación que a través de una función nos convierta una
 * cantidad de euros introducida por teclado a otra moneda, estas pueden ser a
 * dólares, yenes o libras. La función tendrá como parámetros, la cantidad de
 * euros y la moneda a convertir que será una cadena, este no devolverá ningún
 * valor y mostrará un mensaje indicando el cambio (void). El cambio de divisas
 * es: 
 *      * 0.86 libras es un 1€
 *      * 1.28611 $ es un 1€
 *      * 129.852 yenes es un 1€
 */
public class e14 {
    
    private static final DecimalFormat df = new DecimalFormat("0.00000");

    public static void conversorEuros() {
        Scanner leer = new Scanner(System.in);

        System.out.println(
                  ":::::::::MENU::::::::::\n"
                + ":: 1) Libra.         ::\n"
                + ":: 2) Dólar.         ::\n"
                + ":: 3) Yen.           ::\n"
                + "::                   ::\n"
                + ":: Ingrese el tipo   ::\n"
                + ":: de moneda:        ::\n"
                + ":::::::::::::::::::::::\n");

        int opcion = leer.nextInt();

        System.out.println(
                  ":::::::::::::::::::::::\n"
                + ":: Ingrese el monto  ::\n"
                + ":: en euros.         ::\n"
                + ":::::::::::::::::::::::\n");

        double monto = leer.nextInt();
        imprimirMonto(monto, opcion);
    }
    
    public static void imprimirMonto(double monto, int opcion) {
        switch (opcion) {
            case 1:
                System.out.println(monto + "€ = " + df.format(monto * 0.86) + "£");
                break;
            case 2:
                System.out.println(monto + "€ = " + df.format(monto * 1.28611) + "$");
                break;
            case 3:
                System.out.println(monto + "€ = " + df.format(monto * 129.852) + "¥");
                break;
            default:
                System.out.println("ERROR: Opción no valida.");
                
        }
    }
}
