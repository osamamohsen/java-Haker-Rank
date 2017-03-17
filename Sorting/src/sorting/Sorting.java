/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author osama
 */
class Sort{
    int number_swap = 0;
    public int[] bubble_sort(int [] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length-1; j++) {
                if(ar[j]>ar[j+1]){
                    int t = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = t;
                    number_swap ++;
                }
            }
            if(number_swap == 0)
                break;
        }
        return ar;  
    }
}
public class Sorting {

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
        Sort s= new Sort();
        s.bubble_sort(a);
        System.out.println("Array is sorted in "+s.number_swap+" swaps.");
        System.out.println("First Element: "+a[0]);        
        System.out.println("Last Element: "+a[a.length-1]);
    }
    
}
