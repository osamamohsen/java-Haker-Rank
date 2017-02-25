/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.types;

import java.util.Scanner;

/**
 *
 * @author osama
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int int_num = scan.nextInt();
        double db_num = scan.nextDouble();
        scan.nextLine(); //reads the newline
        String str = scan.nextLine();
        System.out.println(int_num+i);       
        System.out.println(db_num+d);
        System.out.println(s+str);
        // TODO code application logic here
    }
    
}
