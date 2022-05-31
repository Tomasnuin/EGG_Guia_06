/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncVectores;

/**
 *
 * @author tomasnuin
 *
 * Funciones comunes para vectores
 */
public class FuncVectores {

    /**
     * imprimirVector: Versión para int. Esta función mostrará en pantalla los
     * elementos de un vector de int en filas de diez elementos.
     *
     * @param vector Vector de enteros que ingresara el usuario.
     */
    public static void imprimirVector(int[] vector) {
        System.out.print("vector[" + vector.length + "] =\n(");
        for (int i = 0; i < vector.length; i++) {

            /**
             * TODO: Averiguar una forma para poner la cantidad de espacios
             * segun la cantidad de digitos que tiene el elemento del vector.
             */
            if (i == vector.length - 1) {
                System.out.print(" " + vector[i]);
            } else if (vector[i] < 10) {
                System.out.print(" " + vector[i] + ", ");
            } else {
                System.out.print(vector[i] + ", ");
            }

            if (i % 10 == 9 && i != vector.length - 1) {
                System.out.print("\n ");
            }

        }
        System.out.println(" )");
    }

    /**
     * imprimirVector: Versión para String. Esta función mostrará en pantalla
     * los elementos de un vector de String en filas de diez elementos.
     *
     * @param vector Vector de tipo String.
     */
    public static void imprimirVector(String[] vector) {

    }

    /**
     * initVectorRand.
     * Inicializa el vector con elementos de min a max
     * @param v 
     * @param min
     * @param max
     */
    public static void initVectorRand(int[] v,int min,int max) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) Math.floor(Math.random()*(max-min+1)+min);
        }
    }
}
