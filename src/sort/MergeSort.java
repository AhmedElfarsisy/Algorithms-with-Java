/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author Elfarsisy
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[]{2, 1, 9, 7, 8, 15, 10, 4, 3, 5};
        mergeSort(array, 0, array.length - 1);
        print(array);

    }

    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            //double qf = Math.Floor((double)((p + r) / 2));
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }

    }

    static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1,
                n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0;i < n1; i++) {
            L[i] = A[p + i];

        }

       
        for ( int j = 0; j < n2; j++) {
            R[j] = A[q + j + 1];
        }
//             L[n1+1]=∞ 
        L[n1] = 2147483647;
        
//              R[n2+1]=∞ 
        R[n2] = 2147483647;

        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }

}
