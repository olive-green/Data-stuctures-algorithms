import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[] a) {
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
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] ngl = solve(a);
    display(ngl);
  }

  public static int[] solve(int[] arr) {
    // solve
    Scanner scn= new Scanner(System.in);
    Stack<Integer> st=new Stack<>();

    int[] ans=new int[arr.length];
    
    for(int i=0;i<arr.length;i++){
      while(st.size()!=0 && arr[i]>st.peek()){
        st.pop();
      }
      if(st.size()==0){
        ans[i]=-1;
      }
      else
        ans[i]=st.peek();
      
      //push curr element
      st.push(arr[i]);
    }
    return ans;
  }

}