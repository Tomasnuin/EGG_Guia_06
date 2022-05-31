package guia6_Java_Intro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import guia6_Java_Intro.ejercicios.*;
import guia6_Java_Intro.ejercicios_extra.*;
import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("¿Ejercicios (f)undamentales o (e)xtras?");

        char opcion = leer.next().charAt(0);

        while (opcion != 'f' || opcion != 'e') {
            System.out.println("Seleccionar ejercicio de la guia: ");
            switch (opcion) {
                case 'f':
                    ejerciciosFundamentales(leer.nextInt());
                    break;
                case 'e':
                    ejerciciosExtra(leer.nextInt());
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    System.out.println("'f' = fundamentales, 'e' = extras.");
                    opcion = leer.next().charAt(0);
                    // Si pasa esto va directamente  a la siguiente iteración del while
                    continue; 
            }

            System.out.println("Presione enter para continuar.");
            leer.nextLine();
            leer.nextLine();

            System.out.println("¿Quiere ver otro ejercicio?");
            System.out.println("'f' = fundamentales, 'e' = extras, 'q' = salir del programa");

            opcion = leer.next().charAt(0);
            if (opcion == 'q') {
                break;
            }
        }
    }

    public static void ejerciciosFundamentales(int fun) {

        /* Pongo que es lo que hace cada ejercicio afuera de su archivo para
         * entender mejor que hace cada programa.
         */
        switch (fun) {
            case 1:
                System.out.println("1) Sumar dos numeros.");
                e01.sumarDosNumeros();
                break;
            case 2:
                System.out.println("2) Imprimir su nombre.");
                e02.imprimirNombre();
                break;
            case 3:
                System.out.println("3) Imprimir frase en mayúsculas y minúsculas");
                e03.fraseMayusMinus();
                break;
            case 4:
                System.out.println("4) Convertir la temperatura en °C a °F.");
                e04.celciusFahrenheit();
                break;
            case 5:
                System.out.println(
                        "5) Mostrar el doble, el triple \n"
                        + "y la raíz cuadrada de un número.");
                e05.dobleTripleRaiz();
                break;
            case 6:
                System.out.println("6) Muestra si un número es par o impar.");
                e06.parOImpar();
                break;
            case 7:
                System.out.println("7) Comprueba si la frase es igual a \"eureka\".");
                e07.fraseEureka();
                break;
            case 8:
                System.out.println("8) Comprueba si la frase ingresada es 8 de largo.");
                e08.frasesOcho();
                break;
            case 9:
                System.out.println("9) Comprueba si la primer letra es 'A'.");
                e09.primerLetraEsA();
                break;
            case 10:
                System.out.println("10) Suma números hasta superar \n"
                        + "el limite indicado.");
                e10.sumaHastaLimite();
                break;
            case 11:
                System.out.println("11) Calculadora simple.");
                e11.calculadora();
                break;
            case 12:
                System.out.println("12) Simulación de dispositivo RS232.");
                e12.simulacionRS232();
                break;
            case 13:
                System.out.println("13) Dibujo de un cuadrado de lado n.");
                e13.cuadradoAsterisco();
                break;
            case 14:
                System.out.println("14) Conversor de euros a otras monedas.");
                e14.conversorEuros();
                break;
            case 15:
                System.out.println("15) Muestra un vector de los 100 primeros \n"
                        + "enteros en orden descendente.");
                e15.vector100();
                break;
            case 16:
                System.out.println("16) Busca la catidad de  veces en la que un \n"
                        + "elemento se encuentra en un vector de tamaño N.");
                e16.buscarVector();
                break;
            case 17:
                System.out.println("17) Cuenta cuantos numeros de 1, 2, 3, 4, y 5 digitos\n"
                        + "hay en un arreglo de tamaño N.");
                e17.vectorCantidadDigitosElemento();
                break;
            case 18:
                System.out.println("18) Crea una matriz 4x4 y muestra su transpuesta.");
                e18.matrizTranspuesta4x4();
                break;
            case 19:
                System.out.println("19) Verifica si una matriz NxN es anti simétrica.");
                e19.esMatrizAntiSimetrica();
                break;
            case 20:
                System.out.println("20) Confirma si la matriz es un cuadrado magico.");
                e20.esCuadradoMagico();
                break;
            case 21:
                System.out.println("21) Busca una matriz 3x3 dentro de una \n"
                        + "matriz 10x10");
                e21.buscarMatriz3x3EnMatriz10x10();
                break;
            default:
                System.out.println("ERROR: numero fueera de rango.");
                System.out.println("Ejercicios fundamentales: 1 al 21.");
        }
    }

    private static void ejerciciosExtra(int extr) {
        switch (extr) {
            case 1:
                System.out.println("1) Convierte minutos a dias y horas.");
                extra01.minutosADiasHoras();
                break;
            case 2:
                System.out.println("2) Intercambia los valores de 4 variables.");
                extra02.intercambioCuatro();
                break;
            case 3:
                System.out.println("3) Averigua si la letra ingresada es una vocal.");
                extra03.esVocal();
                break;
            case 4:
                System.out.println("4) Muestra un número del 1 al 10 en romano.");
                extra04.numRomano();
                break;
            case 5:
                System.out.println("5) Determina cual es el costo de el tratamiento\n"
                        + "según el tipo de socio de la obra social.");
                extra05.socioObraSocial();
                break;
            case 6:
                System.out.println("6) Calcula el promedio de la estatura de las \n"
                        + "personas que miden 1.60mts y el promedio de todas las "
                        + "estaturas en general.");
                extra06.promedioEstaturas();
                break;
            case 7:
                System.out.println("7) Calcula el maximo, el minimo y el promedio \n"
                        + "de N números de dos formas.");
                extra07.maxMinPromDosFormas();
                break;
            case 8:
                System.out.println("8) El usuario ingresa números, si el numero \n"
                        + "es múltiplo de 5, se muestra la cantidad de numeros leidos, \n"
                        + "la cantidad de numeros pares e impares.");
                extra08.ContadorNumTotalParImpar();
                break;
            case 9:
                System.out.println("9) Realiza la división entre dos números.");
                extra09.divisionManual();
                break;
            case 10:
                System.out.println("10) El usuario debe adivinar el resultado de \n"
                        + "la mulipicación entre 2 números aleatorios de 0 a 10.");
                extra10.AdivinarResultadoMultiplicacion();
                break;
            case 11:
                System.out.println("11) Calcula la cantidad de digitos de un número.");
                extra11.catidadDigitos();
                break;
            case 12:
                System.out.println("12) ");
                extra12.Incompleto();
                break;
            case 13:
                System.out.println("13) ");
                extra13.Incompleto();
                break;
            case 14:
                System.out.println("14) ");
                extra14.Incompleto();
                break;
            case 15:
                System.out.println("15) ");
                extra15.Incompleto();
                break;
            case 16:
                System.out.println("16) ");
                extra16.Incompleto();
                break;
            case 17:
                System.out.println("17) ");
                extra17.Incompleto();
                break;
            case 18:
                System.out.println("18) ");
                extra18.Incompleto();
                break;
            case 19:
                System.out.println("19) ");
                extra19.Incompleto();
                break;
            case 20:
                System.out.println("20) ");
                extra20.Incompleto();
                break;
            case 21:
                System.out.println("21) ");
                extra21.Incompleto();
                break;
            case 22:
                System.out.println("22) ");
                extra22.Incompleto();
                break;
            case 23:
                System.out.println("23) ");
                extra23.Incompleto();
                break;
            case 24:
                System.out.println("24) ");
                extra24.Incompleto();
                break;
            default:
                System.out.println("ERROR: numero fueera de rango.");
                System.out.println("Ejercicios extra: 1 al 24.");
        }
    }
}
