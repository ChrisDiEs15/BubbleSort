/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que sirve para ordenar a treves del metodo de burbuja");
        System.out.println("Ingrese el numero de elementos a ordenar");
        int numEl = sc.nextInt();
        /*creates an temp array for store newArray return*/
        int[] tmpArray = new int[numEl];
        /*Call to creates an array*/
        tmpArray = NewArray(numEl);
        /*print unordered array*/
        System.out.println("El arreglo que ha ingresado es:");
        PrintArray(numEl, tmpArray);
        /*pass the tmpArray to order function and overwrite the tmp with bubble ordered*/
        tmpArray = BubbleOrder(numEl, tmpArray);
        System.out.println("El arreglo ordenado es:");
        PrintArray(numEl, tmpArray);

    }

    public static int[] BubbleOrder(int numEl, int[] unorderedArray) {
        int[] newArray = unorderedArray; 

        for (int i = 0; i < numEl - 1; i++) {
            for (int j = 0; j < numEl - i - 1; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }

    /* creates and fills the array */
    public static int[] NewArray(int numEl) {
        int[] newArray = new int[numEl];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numEl; i++) {
            System.out.println("Ingrese el dato en la posicion " + i);
            int nwEl = sc.nextInt();
            newArray[i] = nwEl;
        }

        return newArray;
    }

    /* PrintArray */
    public static void PrintArray(int numEl, int[] arrayToPrint) {
        for (int i = 0; i < numEl; i++) {
            System.out.print(arrayToPrint[i] + " ");
        }
        System.out.println();
    }
}
