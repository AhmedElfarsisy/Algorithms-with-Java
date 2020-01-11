/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.sql.Array;

/**
 *
 * @author Elfar
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[]{2, 1, 9, 7, 8, 15, 10, 4, 3, 5};
        int key;

        for (int j = 1; j < array.length; j++) {
            System.out.print(j + "/");
            key = array[j];
            int i = j - 1;
            while (i >=0 && key < array[i]) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
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
