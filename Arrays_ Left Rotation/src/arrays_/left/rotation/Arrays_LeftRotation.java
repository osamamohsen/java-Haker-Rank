/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_.left.rotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class Arrays_LeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int result[] = new int[n];
        int [] shift = Arrays.copyOfRange(a, 0, k);
        int [] ar = Arrays.copyOfRange(a, k, a.length);
        for (int i = 0; i < ar.length; i++) {
           result[i] = ar[i];
        }
        int xx = ar.length;
        for (int i = 0; i < shift.length; i++ , xx++) {
            result[xx] = shift[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int[] output = new int[a.length];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
