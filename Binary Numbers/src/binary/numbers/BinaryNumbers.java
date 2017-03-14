/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.numbers;

import java.util.*;

/**
 *
 * @author osama
 */
public class BinaryNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String r = Integer.toBinaryString(t);
        String ar [] = r.split("0"); int max = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i].length() > max) max = ar[i].length();
        }
        System.out.println(max);
    }
    
}
