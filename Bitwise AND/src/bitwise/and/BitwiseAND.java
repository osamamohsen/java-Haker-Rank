/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwise.and;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author osama
 */
public class BitwiseAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int max = 0;
            for (int i = 1; i <= n-1; i++) {
                for (int j = i+1; j <= n; j++) {
                    int res = i&j;
                    if( res>max && res<k) max = res;
                }//end for j
            }//end for i
            System.out.println(max);
        }
    }
    
}
