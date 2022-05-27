
2. You are required to complete the body of nodeToRootPath function.
The function is expected to return in form of linked list the path from element to root, if the element with data is found.

Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
120

Sample Output
[120, 80, 30, 10]



public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

 
  
public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
    ArrayList<Integer> arr=new ArrayList<>();
    
    if(node.data==data){
        arr.add(data);
        return arr;
        
    }
    for (Node child : node.children){
        ArrayList<Integer> ans=nodeToRootPath(child,data);
        if(ans.size()>0)
            {
                ans.add(node.data);
                 return ans;
                
            }
    }
    return arr;
 }

}