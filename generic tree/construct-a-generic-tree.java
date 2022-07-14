import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }
  
  public static Node construct(int[] arr){
      Stack<Node> st=new Stack<>();
      Node root=null;
      
      for(int i=0;i<arr.length;i++){
          if(arr[i]==-1){
              st.pop();
          }else{
              Node newNode=new Node();
              newNode.data=arr[i];
              if(st.size()>0){
                  st.peek().children.add(newNode);
              }
              else
                root=newNode;
            st.push(temp);
          }
      }
      return root;
  }
  public static void display(Node root){
      if(root==null)
        return;
      
      
  }

  

  public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
    Node root = construct(arr);
    display(root);
    
  }

}