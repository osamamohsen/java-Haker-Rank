/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked.lists_detect_cycle;

/**
 *
 * @author osama
 */
import java.io.*;
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    } 
}

public class LinkedLists_Detect_Cycle {
    /**
     * @param args the command line arguments
     */
    static boolean hasCycle(Node head) {
        if(head == null) {return false;}
//        boolean [] visited = new boolean[101];   
        Node fast = head.next,slow = head;
        while(fast != null && fast.next !=null && slow != null){
            if(fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
    
    public static Node insert(Node head,int data){
        if(head==null){
            head = new Node(data);
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next =  new Node(data);
        }
        return head;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        Node head = null;
        while(x-- > 0){
            int w = s.nextInt();
            head = insert(head, w);
        }
        System.out.println(hasCycle(head));
        
    }
    
}
