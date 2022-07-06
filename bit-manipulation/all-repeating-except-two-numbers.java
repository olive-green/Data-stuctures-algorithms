1. You are given an array of numbers.
2. You have to find 2 non-repeating numbers in an array.
3. All repeating numbers are repeating even number of times.

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   //write your code here
   int xor=arr[0];
   for(int i=1;i<arr.length;i++){
       xor^=arr[i];
   }
   int rsb=xor & ((~xor)+1);
   int n1=0,n2=0;
   for(int i=0;i<arr.length;i++){
       if((arr[i]&rsb)==0)//bit is set
        n1=n1^arr[i];
       else
        n2=n2^arr[i];
   }
//   System.out.println(Math.min(n1,n2));
//   System.out.println(Math.max(n1,n2));
   
  }

}