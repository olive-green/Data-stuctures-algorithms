/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static class Queue{
        int capacity=6;
    	int[] arr=new int[capacity];
    	int front=0,rear=0;
    	int size=0;
    	
        
         void push(int n){
                if(size==capacity)
                    System.out.println("full");
                arr[rear%capacity]=n;
                rear++;
                size++;
            
        }
         int pop(){
            if(size==0)
                // System.out.println("stack is empty");
                return -1;
            int x= arr[front%capacity];
            front++;
            return x;
        }
        int top(){
            if(size==0)
                return -1;
            return arr[front%capacity];
        }
        //  int size(){
        //     return top+1;
        // }
    }
	
	public static void main (String[] args) {
	    //create a Queue
	    Queue q=new Queue();
	    q.push(1);
	    q.push(5);
	    q.push(6);
	    
	   
	    
		System.out.println(q.pop());
		System.out.println(q.top());
	}
}