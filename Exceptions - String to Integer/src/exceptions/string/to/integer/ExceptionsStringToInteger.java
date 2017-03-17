/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions.string.to.integer;

import java.util.Scanner;

/**
 *
 * @author osama
 */


public class ExceptionsStringToInteger {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int res = Integer.parseInt(S);
            System.out.println(res);
        }catch(NumberFormatException ex){
            System.out.println("Bad String");            
        }

    }
    
}
