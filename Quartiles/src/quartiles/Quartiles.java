/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartiles;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class Quartiles {

    public static int get_median(int []ar ,int start , int end){
        int size = end - start +1;
        if(size %2 != 0) 
            return ar[start+size/2];
        return (ar[start+size/2 -1]+ar[(start+size/2)] )/2;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        Arrays.sort(ar);
        int [] med = new int[3];
        med[1] = get_median(ar,0,n-1);
        if(ar.length %2 != 0) {
            med[0] = get_median(ar,0,(n/2)-1);
            med[2] = get_median(ar,(n/2)+1,n-1);
        }else{
            med[0] = get_median(ar,0,(n/2)-1);
            med[2] = get_median(ar,(n/2),n-1);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(med[i]);
        }
    }
    
}
