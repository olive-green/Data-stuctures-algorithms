/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node *next;
            Node(int data) 
            {
               this->data = data;
              this->next = NULL;
            }
        };

*****************************************************************/

Node *findMiddle(Node *head) {
    // Write your code here
    //we use fast and slow pointer apporach where fast is incresing two times more than slow pointe
    //edge cases
    if(head==NULL || head->next==NULL){
        return head;
    }
    Node* fast=head->next;
    Node* slow=head;
    while(fast!=NULL){
        fast=fast->next;
        //to increase fast one more time we check whether it is null or not
        if(fast!=NULL){
            fast=fast->next;
        }
        slow=slow->next;
    }
    return slow;
}
//time complextiy - O(n/2);
//space- O(1)