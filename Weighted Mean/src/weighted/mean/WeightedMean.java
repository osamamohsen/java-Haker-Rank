/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weighted.mean;

import java.util.Scanner;

/**
 *
 * @author osama
 */
public class WeightedMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(),y;
        int[] ar = new int [x];
        for (int i = 0; i < x; i++) {
            ar[i] = scan.nextInt();
        }
        int sum=0,weights=0;
        for (int i = 0; i < x; i++) {
            y = scan.nextInt();
            weights += y;
            sum += ar[i]*y;
        }
        double result = (double)((double)sum/(double)weights);
        System.out.println(String.format("%.1f",result));
        }
    
}
