/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;
import java.util.*;

/**
 *
 * @author osama
 */
public class Recursion {

    public int factorial(int n){
        if(n==1 || n==0) return 1;
        return n*factorial(n-1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Recursion r = new Recursion();
        int x = s.nextInt();
        System.out.println(r.factorial(x));
    }
    
}
