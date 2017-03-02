/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

import java.util.Scanner;

/**
 *
 * @author osama
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        double result = mealCost + (mealCost * ((double)tipPercent/100)) + (mealCost * ((double)taxPercent/100));
        System.out.println("The total meal cost is "+(int)Math.round(result)+" dollars.");
        
        // Write your calculation code here.
      
        // cast the result of the rounding operation to an int and save it as totalCost 
    }
    
}
