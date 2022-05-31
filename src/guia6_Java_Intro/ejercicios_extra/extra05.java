/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios_extra;

import java.util.Scanner;

/**
 * 5. Una obra social tiene tres clases de socios: 
 * 
 * o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
 *      en todos los tipos de tratamientos.
 * 
 * o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
 *      para los mismos tratamientos que los socios del tipo A.
 * 
 * o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
 *      dichos tratamientos.
 * 
 * Solicite una letra (carácter) que representa la clase de un socio, y luego
 * un valor real que represente el costo del tratamiento (previo al descuento) y
 * determine el importe en efectivo a pagar por dicho socio.
 */

public class extra05 {

    public static void socioObraSocial() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¿Qué tipo de socio es usted? A, B, o C");
        char socio = leer.next().toUpperCase().charAt(0);
        
        System.out.println("Ingrese el costo del tratamiento.");
        double costo = leer.nextInt();
        
        switch(socio){
            case 'A':
                System.out.println("El coste de su tratamiento tiene un 50% de descuento.\n"
                        + "El coste final es $" + (costo-costo/2) );
                break;
            case 'B':
                System.out.println("El coste de su tratamiento tiene un 35% de descuento.\n"
                        + "El coste final es $" + (costo - costo * 35/100));
                break;
            case 'C':
                System.out.println("El coste de su tratamiento tiene un 0% de descuento.\n"
                        + "El coste final es $" + costo);
                break;
            default:
        }
    }
}
