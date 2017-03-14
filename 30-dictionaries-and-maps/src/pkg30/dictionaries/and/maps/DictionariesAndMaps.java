/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30.dictionaries.and.maps;

import java.util.*;

/**
 *
 * @author osama
 */
public class DictionariesAndMaps {

    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap hm = new HashMap();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(hm.get(s)!=null)
                System.out.println(s+"="+hm.get(s));
            else System.out.println("Not found");
            // Write code here
        }
        in.close();
    }
    
}
