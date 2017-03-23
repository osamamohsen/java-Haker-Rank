/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package running.time.and.complexity;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author osama
 */
public class RunningTimeAndComplexity {

//    boolean [] ar = new boolean[2000000000];
    
    static boolean primes(int x){
        for (int i = 3; i <x/2; i+=2) {
            if(x%i == 0)
                return false;
        }//end loop
        return true;
    }//end function
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(),x;
        for (int i = 0; i < t; i++) {
            x = s.nextInt();
            if(x==1) System.out.println("Not prime");
            else if(x==2) System.out.println("Prime");
            else if(x%2 == 0) System.out.println("Not prime");
            else if(primes(x)) System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
    
}
