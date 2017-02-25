/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author osama
 */
public class Solution {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
                
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

                   System.out.println("Hello, World.");                   
                   System.out.println(inputString);

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
	}
}
