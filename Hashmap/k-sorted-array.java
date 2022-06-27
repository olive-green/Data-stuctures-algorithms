You are required to find and print the k largest elements of array in increasing order.
input-
9-n
3
2
4
1
6
5
7
9
8
3 -k

output-
1 2 3 4 5 6 7 8 9

import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      PriorityQueue<Integer> minpq=new PriorityQueue<>();
      
      //insert first k+1 elements
      for(int i=0;i<k+1;i++){
          minpq.add(arr[i]);
      }
      
      for(int i=k+1;i<n;i++){
          System.out.println(minpq.remove());
          minpq.add(arr[i]);
      }
      
      //last mai jo pq mai elements left hogye
      while(minpq.size()>0){
          System.out.println(minpq.remove());
      }
   }

}