/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope;

import java.util.Scanner;

/**
 *
 * @author osama
 */

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int [] ar) {
        this.elements = ar;
    }

    void computeDifference() {
        int length = this.elements.length;
        this.maximumDifference = 0; boolean ch = false;
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                int res= Math.abs(this.elements[i]-this.elements[j]);
                if(res > this.maximumDifference || ch==false) {this.maximumDifference = res; ch=true;}
            }
        }
    }
    
    
}


public class Scope {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
    
}
