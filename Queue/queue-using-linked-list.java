/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    
    
    
	public static void main (String[] args) {
	    //implement queue is case of insert a node at the end of the linkedlist
	    //while stack is case of insert a node a the beginning 
// 		System.out.println("GfG!");
        //create a Stack
        Queue q=new Queue();
        q.display();
        q.push(1);
        q.push(3);
        q.push(6);
        q.display();
        
	}
}

class Queue{
    
    class Node{
        int val;
        Node next;
    }
    
    Node head;
    //constructor
    Queue(){
        this.head=null;
    }
    public void push(int x){
        Node newNode=new Node();
        if(newNode==null)
        {
            System.out.println("Heap overflow");
            return;
        }
        newNode.val=x;
        newNode.next=null;
        Node temp=head;
        if(temp==null){
            temp=newNode;
            head=temp;
            return;
        }
        
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
        
    }
    
    int pop(){
        if(head==null)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int ans=head.val;
        head=head.next;
        return ans;
        
    }
    
    int peek(){
        if(head==null)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        
        return head.val;
    }
    public void display(){
        if(head==null)
        {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
        
    
}