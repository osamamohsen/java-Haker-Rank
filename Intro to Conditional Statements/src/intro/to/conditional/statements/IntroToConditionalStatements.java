/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.to.conditional.statements;

import java.util.Scanner;

/**
 *
 * @author osama
 */
public class IntroToConditionalStatements {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%2 != 0 || (n%2==0 && n>=6 && n<=20)) System.out.println("Weird");
        else if((n%2==0 && n>=2 && n<=5) || (n%2==0 && n>20)) System.out.println("Not Weird");
        else System.out.println("Not Weird");
    }
    
}
