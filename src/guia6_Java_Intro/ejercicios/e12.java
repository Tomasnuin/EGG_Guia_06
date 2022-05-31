/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_Java_Intro.ejercicios;

import java.util.Scanner;

/**
 * 12. Realizar un programa que simule el funcionamiento de un dispositivo
 * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
 * cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5
 * caracteres de largo, el primer carácter tiene que ser X y el último tiene que
 * ser una O. Las secuencias leídas que respeten el formato se consideran
 * correctas, la secuencia especial “&&&&&” marca el final de los envíos
 * (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato
 * se considera incorrecta. Al finalizar el proceso, se imprime un informe
 * indicando la cantidad de lecturas correctas e incorrectas recibidas. Para
 * resolver el ejercicio deberá investigar cómo se utilizan las siguientes
 * funciones de Java Substring(), Length(), equals().
 */

// max 5 caracteres, start: X ends:O (ej:XyO)

public class e12 {

    public static void simulacionRS232() {
        Scanner leer = new Scanner(System.in);
        int correctas = 0, incorrectas = 0;
        String cadena = "";
        
        System.out.println("Las cadenas aceptadas tienen las siguientes condiciones\n"
                         + "1- Un máximo de 5 caracteres.\n"
                         + "2- Empiezan con 'X' y terminan con 'O'.");
        
        while(!"&&&&&".equals(cadena)){
            System.out.println("Ingresar cadena de caracteres: ");
            cadena = leer.next();
            
            if (    cadena.length() <= 5 
                    && cadena.endsWith("O") 
                    && cadena.startsWith("X")) {
                correctas++;
            }else if(!"&&&&&".equals(cadena)){
                incorrectas++;
            }
        }
        System.out.println("Proceso finalizado.\n"
                         + "Lecturas correcta/s: " + correctas
                         + "\nLecturas incorrecta/s: " + incorrectas);
    }
}
