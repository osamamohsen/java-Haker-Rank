/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks_balanced.brackets;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author osama
 */
public class Stacks_BalancedBrackets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
        // TODO code application logic here
    }

    private static boolean isBalanced(String expression) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) == '{' || expression.charAt(i) == '(' || expression.charAt(i) == '[')
                st.push(expression.charAt(i));
            else{
                if(st.empty()) return false;
                char top = st.pop();
                if(!((expression.charAt(i)==')' && top=='(') || (expression.charAt(i)==']' && top=='[') || 
                        (expression.charAt(i)=='}' && top=='{') ))
                    return false;
            }

        }
        return st.empty();
    }
    
}
