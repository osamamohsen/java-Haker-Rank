/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package making.anagrams;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author osama
 */
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {

        int remove = 0;
        for (int i = 0; i < first.length(); i++) {
            int pos = second.indexOf(first.charAt(i));
            if(pos>=0){
                second = second.substring(0,pos)+'-'+second.substring(pos+1,second.length());
            }
            else remove++;
        }
        for (int i = 0; i < second.length(); i++) {
            if(second.charAt(i) != '-')
                remove++;
        }
        return remove;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
    
}
