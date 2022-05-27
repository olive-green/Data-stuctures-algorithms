
2. You are required to complete the body of areSimilar function. 
The function is expected to check if the two trees passed to it are similar in shape or not.

Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
24
1 2 5 -1 6 -1 -1 3 7 -1 8 11 -1 12 -1 -1 9 -1 -1 4 10 -1 -1 -1

Sample Output
true



public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

 
  
 public static boolean areSimilar(Node n1, Node n2) {
    // write your code here
    if(n1.children.size()!=n2.children.size()){
        return false;
    }
    int i=n1.children.size();
    int j=n2.children.size();
    while(i-->0 && j-->0){
        Node child1=n1.children.get(i);
        Node child2=n2.children.get(j);
        boolean ans=areSimilar(child1,child2);
        if(ans==false)
            return ans;
    }
    
    return true;
  }


}