/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.sort;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author osama
 */
public class BubbleSort {

    static int bubble_swap(int a[]){
        int numberOfSwaps = 0;

        for (int i = 0; i < a.length; i++) {
                // Track number of elements swapped during a single array traversal
            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int lower = a[j+1];
                    a[j+1] = a[j];
                    a[j] = lower;
//                    Arrays. swap(a[j], a[j + 1]);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        return numberOfSwaps;
    }//print 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int numberOfSwapped = bubble_swap(a);
        System.out.println("Array is sorted in "+numberOfSwapped+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length - 1]);
    }
    
}
