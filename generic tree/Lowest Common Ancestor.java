
2. You are required to complete the body of lca function. 
The function is expected to return the lowest common ancestor of two data values that are passed to it. 

Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
120
80

Sample Output
80

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
    if (node.data == data) {
      ArrayList<Integer> path = new ArrayList<>();
      path.add(node.data);
      return path;
    }

    for (Node child : node.children) {
      ArrayList<Integer> ptc = nodeToRootPath(child, data);
      if (ptc.size() > 0) {
        ptc.add(node.data);
        return ptc;
      }
    }

    return new ArrayList<>();
  }

  public static int lca(Node node, int d1, int d2) {
      
    // write your code here
    
    ArrayList<Integer> path1=nodeToRootPath(node,d1);
    ArrayList<Integer> path2=nodeToRootPath(node,d2);
    int i=path1.size();
    int j=path2.size();
    int ans=node.data;
    while(i-->0 && j-->0){
        if(path1.get(i)==path2.get(j)){
            ans=path1.get(i);
        }
        else{
            return ans;
        }
    }
    return ans;

    
  }

