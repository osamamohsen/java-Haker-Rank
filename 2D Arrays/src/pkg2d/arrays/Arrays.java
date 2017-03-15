/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d.arrays;

import java.util.Scanner;

/**
 *
 * @author osama
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum=0 , newsum=0; boolean ch=false;
        for(int i=1; i < 5; i++){
            newsum =0;
            for(int j=1; j < 5; j++){
                newsum = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+
                        arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+
                        arr[i+1][j+1];
                if(newsum > sum || ch==false){ sum = newsum; ch=true;}
            } //end j
        }//end i
        System.out.println(sum);
    }//end main
    
}
