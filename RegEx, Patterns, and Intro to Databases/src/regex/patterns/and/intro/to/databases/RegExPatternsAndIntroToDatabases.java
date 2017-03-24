/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex.patterns.and.intro.to.databases;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author osama
 */
public class RegExPatternsAndIntroToDatabases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String [] ar = new String[N];
        int counter = 0;
//        contains = s.matches(".*\\bram\\b.*");
        //Arrays.asList(yourArray).contains(yourValue)
        String regx = "@gmail.com$";
        Pattern pattern = Pattern.compile(regx);

        for(int a0 = 0; a0 < N; a0++){
            String name = in.next();
            String emailID = in.next();
            Matcher matcher = pattern.matcher(emailID);
            if(matcher.find()){
                ar[counter] = name;
                counter++;
            }
        }
        Arrays.sort(ar,0,counter);
        for (int i = 0; i < counter; i++) {
            System.out.println(ar[i]);
        }
    }
    
}
