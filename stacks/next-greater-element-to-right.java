import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
   Stack<Integer> st=new Stack<>();
  //  st.push(arr[arr.length-1]);
    int[] ans=new int[arr.length];
  //  for(int i=arr.length-1;i>=0;i--){
  //     if(st.size()==0)
  //       ans[i]=-1;
  //     else{
  //       while(st.size()!=0){
  //         if(arr[i]<st.peek()){
  //            ans[i]=st.peek();
  //            break;
  //         }
  //         st.pop();
  //       }
  //       if(st.size()==0)
  //           ans[i]=-1;
  //     }
  //     st.push(arr[i]);

  //  }


        // OR
      for(int i=arr.length-1;i>=0;i--){
        //pop element until the stack top element is greater than arr[i]
        while(st.size()!=0){
          if(arr[i]<st.peek()){
            break;
          }
          st.pop();
        }
        //if stack is empty ie. no greater element
        if(st.size()==0)
          ans[i]=-1;
        else
          ans[i]=st.peek();
        
        //push current element everytime because maybe next element's greater right is current element
        st.push(arr[i]);
      }

   return ans;
 }

}