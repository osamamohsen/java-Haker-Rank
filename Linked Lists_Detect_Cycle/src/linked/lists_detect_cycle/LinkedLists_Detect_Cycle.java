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
public class LinkedLists_Detect_Cycle {

    class Node {
        int data;
        Node next;
    }
    /**
     * @param args the command line arguments
     */
    boolean hasCycle(Node head) {
        if(head == null || head.next == null || head.data==0) {return false;}
        else if(head.data != 0){
            head.data = 0;
            head = head.next;
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
    }
    
}
