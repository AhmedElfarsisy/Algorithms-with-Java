/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author Elfarsisy
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int array[] = new int[]{2, 1, 9, 7, 8, 15, 10, 4, 3, 5};
        BubbleSort.bubbleSort(array);
    }
    
    public static void bubbleSort(int array[]){
        int length=array.length;
        int temp;
        for (int i = 0; i < length-1; i++) {
            for (int j = 1; j < (length-i); j++) {
                if (array[j-1]>array[j]) {
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }

        }
        print(array);
    
    }
    
    
    
    
     public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    
     }
}
