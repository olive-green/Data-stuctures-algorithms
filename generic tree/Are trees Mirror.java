
2. You are required to complete the body of areMirror function. 
The function is expected to check if the two trees passed to it are mirror images of each other in shape (data not to be checked, just the shape of tree).

Sample Input
12
10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
12
100 200 -1 300 500 -1 600 -1 -1 400 -1 -1

Sample Output
true



public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

 
  
  public static boolean areMirror(Node n1, Node n2) {
    // write your code here
    if(n1.children.size()!=n2.children.size()){
        return false;
    }
    for(int i=0;i<n1.children.size();i++){
        Node child1=n1.children.get(i);
        Node child2=n2.children.get(n2.children.size()-1-i);
        
        boolean ans=areMirror(child1,child2);
        if(ans==false)
            return false;
        
    }
    return true;
  }

}