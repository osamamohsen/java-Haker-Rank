/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash.tables.ransom.note;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class Solution {

    Map magazineMap = new HashMap();
    Map noteMap = new HashMap();
    boolean check = true;
    public  Solution(String magazine, String note) {
        String[] stringArray = magazine.split("\\s+");
        for (String str : stringArray)
        {
            if(magazineMap.containsKey(str)) magazineMap.put(str, (int)magazineMap.get(str)+1);
            else magazineMap.put(str,1);
        }
        stringArray = note.split("\\s+");
        for (String str : stringArray)
        {
            if(magazineMap.containsKey(str)){
                int num = (int)magazineMap.get(str); num--;
                magazineMap.remove(str);
                if(num !=0) magazineMap.put(str, num);
            }
            else check = false;
        }
    }
    
    public boolean solve() {
        if(check == true) return true;
        else return false;
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
