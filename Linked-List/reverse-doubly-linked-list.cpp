struct Node
{
    int data;
    Node * next;
    Node * prev;
    Node (int x)
    {
        data=x;
        next=NULL;
        prev=NULL;
    }
        
};
*/
Node* reverseDLL(Node * head)
{
    //Your code here
    Node* curr=head;
    Node* next=NULL;
   
    while(curr!=NULL){
        next=curr->next;
        curr->next=curr->prev;
        curr->prev=next;
        head=curr; //this is changed to keep track of head node
        curr=next;
    }
    return head;
}
