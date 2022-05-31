/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/**11. Realizar un programa que pida dos números enteros positivos por teclado 
 * y muestre por pantalla el siguiente menú:
 * 
 *                MENU
 *                1. Sumar
 *                2. Restar
 *                3. Multiplicar
 *                4. Dividir
 *                5. Salir
 *                Elija opción:
 * 
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado
 * por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que
 * se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción
 * 5, en vez de salir del programa directamente, se debe mostrar el siguiente
 * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si
 * el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se
 * vuelve a mostrar el menú.
 */

/** Lo que pienso es que primero se piden los numeros y luego se muestra 
 *  el menu, asi se pueden hacer diferentes operaciones con esos dos numeros.
 */

public class e11 {

    public static void calculadora() {
        Scanner leer = new Scanner(System.in);
        Boolean continuar = true;
        int opcion;
        
        System.out.println("Ingrese dos numeros.");
        double num1 = leer.nextDouble() , num2 = leer.nextDouble() ;
        
        while(continuar){
            System.out.println(
                      "   MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opcion");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println( num1 + " + " + num2 + " = " + (num1+num2) );
                    break;
                case 2:
                    System.out.println( num1 + " - " + num2 + " = " + (num1-num2) );
                    break;
                case 3:
                    System.out.println( num1 + " * " + num2 + " = " + (num1*num2) );
                    break;
                case 4:
                    System.out.println( num1 + " / " + num2 + " = " + (num1/num2) );
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    if (leer.next().toUpperCase().charAt(0) == 'S') {
                        System.out.println("Saliendo del programa.");
                        continuar = false;
                    }
                    break;
                default:
                    System.out.println("Error: opción no valida.");
            }
            
            if(continuar){
                System.out.println("Presione enter para continuar.");
                leer.nextLine();
                leer.nextLine();
            }
        }
        
    }
}
