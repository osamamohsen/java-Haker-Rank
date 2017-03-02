/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash.tables.ransom.note;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class Solution {

Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
      for (String retval: magazine.split("-")) {
          magazineMap. put(retval, 1);
      }
      for (String retval: note.split("-")) {
          noteMap. put(retval, 1);
      }
    }
    
    public boolean solve() {
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
    
}
