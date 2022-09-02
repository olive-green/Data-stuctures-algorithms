// Segregate even and odd nodes in a Link List

class Solution{
    Node divide(int N, Node head){
        // code here
         // intuition
        // Put the odd nodes in a odd linked list and
        // the even nodes in another. Then link the evenList to the tail of the oddList.
        Node oddHead=new Node(-1);
        Node odd=oddHead;
        Node even=new Node(-1);
        Node curr=head; 
        head=even; //to point the first node of even list
        while(curr!=null){
            if(curr.data%2==0){
                even.next=curr;
                even=even.next;
            }
            else{
                odd.next=curr;
                odd=odd.next;
            }
            curr=curr.next;
        }
        even.next=oddHead.next;
        odd.next=null;
        head=head.next;
        return head;
    }
}