/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    // We can assume our linked list to be a horizontal stack 
    // where the operations like deletion and insertion would
    // take place at the top of the stack or at the head of the linked list.
    static class Stack{
        private class StackNode{
            int val;
            StackNode next;
            StackNode(int val){
                this.val=val;
                this.next=null;
            }
        }
        StackNode top;
        int size;
        
        void push(int x){
            StackNode newNode=new StackNode(x);
            newNode.next=top;
            top=newNode;
            size++;
        }
        // Removing an element from the top of the stack is 
        // the same as removing the element from the beginning of our linked list.
        int pop(){
            if(top==null)
                return -1;
            int peek=top.val;
            top=top.next;
            size--;
            return peek;
        }
        boolean isEmpty(){
            return top==null;
        }
        
    }
	public static void main (String[] args) {
		Stack s = new Stack();
    s.push(10);
    s.push(20);
    // s.printStack();
    System.out.println("Element popped " + s.pop());
    // System.out.println("Stack size: " + s.size());
    System.out.println("Stack is empty or not: " + s.isEmpty());

	}
}