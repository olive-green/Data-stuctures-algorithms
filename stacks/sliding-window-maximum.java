import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
     Deque<Integer>dq= new ArrayDeque<>();
   //  int i=0;
   //consider first k elements
   for(int i=0;i<k;i++){
      //pop elements from queue if arr[i]>dq.getLast
      while(dq.size()>0 && arr[i]> arr[dq.getLast()])
         dq.removeLast();
      dq.addLast(i);
   }
   //print ans
   System.out.println(arr[dq.peek()]);

   //now remaining elements
    for(int i=k;i<n;i++){
      //pop elements from queue if arr[i]>dq.getLast
      while(dq.size()>0 && arr[i]> arr[dq.getLast()])
         dq.removeLast();
      
      //now checks whether the elements in queue is out of range of windows
      if( dq.size()>0 && dq.peek()<=i-k ){
         //if  yes then remove them
         dq.removeFirst();
      }
      //push current element
      dq.addLast(i);
      //print ans
      System.out.println(arr[dq.peek()]);
    }
 }
}