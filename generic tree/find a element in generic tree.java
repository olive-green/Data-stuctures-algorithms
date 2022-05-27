
You are required to complete the body of find function. 
The function is expected to find the given data in the tree, if found it should return true or return false.

Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
120

Sample Output
true



public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

 
  

  public static boolean find(Node node, int data) {
    // write your code here
    for (Node child : node.children) {
        return find(child,data);
    }
    if(node.data==data)
        return true;
    else
        return false;
    
  }

}