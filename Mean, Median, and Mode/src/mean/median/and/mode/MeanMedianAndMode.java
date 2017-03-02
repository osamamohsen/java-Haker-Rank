/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mean.median.and.mode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class MeanMedianAndMode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
            sum += ar[i];
        }
        Arrays.sort(ar);
        System.out.println(sum/n);
        if(n%2!=0) System.out.println((double)ar[n/2]);
        else System.out.println((double)(ar[n/2]+ar[(n-1)/2])/2);
        int counter=1;int num=ar[0]; int cc=1;
        for (int i = 1,j=0; i < n; i++,j++) {
            if(ar[j]==ar[i]){ 
                cc++;
                if(cc > counter){
                    num = ar[i]; counter=cc;
                }
            } else cc=1;
        }
        System.out.println(num);
        
    }
    
}
