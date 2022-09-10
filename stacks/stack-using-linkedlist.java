/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    
    
    
	public static void main (String[] args) {
// 		System.out.println("GfG!");
        //create a Stack
        Stack st=new Stack();
        st.display();
        st.push(1);
        st.push(3);
        st.push(6);
        st.display();
        
	}
}

class Stack{
    
    class Node{
        int val;
        Node next;
    }
    
    Node top;
    //constructor
    Stack(){
        this.top=null;
    }
    public void push( int x){
        Node newNode=new Node();
        if(newNode==null)
        {
            System.out.println("Heap overflow");
            return;
        }
        newNode.val=x;
        newNode.next=top;
        top=newNode;
    }
    
    int pop(){
        if(top==null)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        int ans=top.val;
        top=top.next;
        return ans;
        
    }
    
    int peek(){
        if(top==null)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        
        return top.val;
    }
    public void display(){
        if(top==null)
        {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
        
    
}