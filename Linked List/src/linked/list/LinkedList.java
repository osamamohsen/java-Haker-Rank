/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked.list;

import java.util.Scanner;

/**
 *
 * @author osama
 */
class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
public class LinkedList {

    public static  Node insert(Node head,int data) {
    if (head == null){
        head = new Node(data);
    }
    else {
            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node(data);
        }
        return head;
    }
    
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
    
}
