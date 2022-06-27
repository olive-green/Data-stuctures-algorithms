You are required to find and print the k largest elements of array in increasing order.
input-
13 - n
12
62
22
15
37
99
11
37
98
67
31
84
99
4 -k
output-
84
98
99
99
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
      PriorityQueue<Integer> minpq= new PriorityQueue<>();
      
      for(int i=0;i<n;i++){
          minpq.add(arr[i]);
          if(minpq.size()>k)
            minpq.remove();
      }
      //print ans
      while(minpq.size()>0){
          System.out.println(minpq.remove());
      }
    }

}