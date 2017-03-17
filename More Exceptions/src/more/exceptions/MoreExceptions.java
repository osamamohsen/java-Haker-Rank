/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package more.exceptions;

import java.util.Scanner;

/**
 *
 * @author osama
 */

class Calculator{

    int power(int n, int p) {
        if (n < 0 || p < 0){
            throw new IllegalArgumentException("n and p should be non-negative");
        }else{
            if(p==1) return n;
            else if(p==0) return 1;
            else if(p%2 == 0){
                return power(n*n, p/2);
            }else{
                return n*power(n*n, p/2);
            }
        }
    }
    
}

public class MoreExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
    
}
