/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues.and.stacks;

import java.util.*;

/**
 *
 * @author osama
 */
public class Solution {

    Stack<Character> s = new Stack<Character>();
    Queue<Character> q = new LinkedList<Character>();

        private void pushCharacter(char c) {
        s.push(c);
    }

    private void enqueueCharacter(char c) {
        q.add(c);
    }

    private char popCharacter() {
        char c = s.peek();
        s.pop();
        return c;
    }

    private char dequeueCharacter() {
        char c = q.peek();
        q.poll();
        return c;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
    
}
