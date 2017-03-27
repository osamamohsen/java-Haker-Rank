/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d.array.ds;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author osama
 */
public class ArrayDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int ar[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                ar[arr_i][arr_j] = in.nextInt();
            }
        }
        int max = -64;
         for(int i=1; i < 5; i++){
            for(int j=1; j < 5; j++){
                int num = ar[i][j]+ar[i-1][j-1]+ar[i-1][j]+ar[i-1][j+1]+ar[i+1][j-1]+ar[i+1][j]+ar[i+1][j+1];
                if(num > max) max = num;
           }
        }
         System.out.println(max);
    }
    
}
