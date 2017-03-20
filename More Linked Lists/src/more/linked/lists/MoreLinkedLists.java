/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package more.linked.lists;

/**
 *
 * @author osama
 */
import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}

public class MoreLinkedLists {

    
    public static Node removeDuplicates(Node head) {
        Node new_head = null;
        if(head == null) return head;
        else{
            Node x = head;
            Node y = head.next;
            if(y==null){
                new_head = insert(new_head, x.data);
                return new_head;
            }
            while(x.next != null && y.next != null){
                if(x.data != y.data){
                    //here not same
                    new_head = insert(new_head, x.data);
                }
                x= x.next; y=y.next;
            }
             
            if(x.data != y.data){

                //insert x.data
                new_head = insert(new_head, x.data);
                //insert y.data
                new_head = insert(new_head, y.data);
            }else{

                new_head = insert(new_head, x.data);
            }
        }
        return new_head;
    }
        
    /**
     * @param args the command line arguments
     */
    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    
}
