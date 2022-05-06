import java.io.*;
import java.util.*;

public class Main{
  
public static int[] nsl(int[] arr){
   Stack<Integer> left=new Stack<>();
   int ans[]= new int[arr.length];
   for(int i=0;i<arr.length;i++){
       while(left.size()!=0){
          if(arr[left.peek()]<arr[i]){
             ans[i]=left.peek();
             break;
          }
          left.pop();
       }
       if(left.size()==0){
          ans[i]=-1;
       }
       left.push(i);
   }
       return ans;
}
public static int[] nsr(int[] arr){

   Stack<Integer> right=new Stack<>();
   int ans[]= new int[arr.length];
   for(int i=arr.length-1;i>=0;i--){
      while(right.size()!=0){
          if(arr[right.peek()]<arr[i]){
             ans[i]=right.peek();
             break;
          }
          right.pop();

       }
       if(right.size()==0){
          ans[i]=arr.length;
       }
       right.push(i);
   }
   return ans;
}
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    // code
    int[] left=nsl(a);
    int[] right=nsr(a);
    int maxArea= Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
       int width= right[i] - left[i] -1;
       int length= a[i];
       int area= width*length;
       if(area>maxArea)
         maxArea=area;
    }
    System.out.println(maxArea);
    
 }
}