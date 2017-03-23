/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested.logic;

import java.util.Scanner;

/**
 *
 * @author osama
 */
public class NestedLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] ar = new int [6];
        for (int i = 0; i < 6; i++) {
            ar[i] = s.nextInt();
        }
        if(ar[2] > ar[5]) System.out.println("10000");
        else if(ar[1] > ar[4] && ar[2]==ar[5]) System.out.println((ar[1]-ar[4])*500);
        else if(ar[0] > ar[3] && ar[1]==ar[4]) System.out.println((ar[0]-ar[3])*15);
        else System.out.println("0");
    }
    
}
