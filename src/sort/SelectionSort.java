/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;

/**
 *
 * @author Elfar
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //selection sort
        int array[] = new int[]{2, 1, 9, 7, 8, 15, 10, 4, 3, 5};
        int min;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(i + "/");
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;

            for (int k = 0; k < 10; k++) {
                System.out.print(array[k]);
            }
            System.out.println("");
        }
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x]);

        }

    }

}
