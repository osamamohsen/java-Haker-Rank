/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package let.s.review;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class LetSReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int v=0;v<n;v++){            
            String r = scan.nextLine();
            String[] ar = new String[2];
            Arrays.fill(ar, 0, 2, "");
            for(int i=0;i<r.length();i++){
                if(i%2==0)
                ar[0] += r.charAt(i);
                else ar[1] += r.charAt(i);
            }
            System.out.println(ar[0]+" "+ar[1]);
        }

    }
    
}
