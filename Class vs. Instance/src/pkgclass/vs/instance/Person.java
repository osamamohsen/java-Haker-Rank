/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.vs.instance;

import java.util.Scanner;

/**
 *
 * @author osama
 */
public class Person {

    int personAge;
    public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
        if(initialAge <= 0 ){ System.out.println("Age is not valid, setting age to 0."); initialAge=0;}
        personAge = initialAge;
    }

    public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
        if(personAge<13){ System.out.println("You are young."); }
        else if(personAge>=13 && personAge<18){ System.out.println("You are a teenager.");}
        else{ System.out.println("You are old."); }
    }

    public void yearPasses() {
            // Increment this person's age.
        personAge++;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                    p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();  
    }
    
}
