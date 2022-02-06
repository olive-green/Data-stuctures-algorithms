/****************************************************************

    Following is the class structure of the LinkedListNode class:

    template <typename T>
    class LinkedListNode
    {
    public:
        T data;
        LinkedListNode<T> *next;
        LinkedListNode(T data)
        {
            this->data = data;
            this->next = NULL;
        }
    };

*****************************************************************/
// LinkedListNode<int> *reverse(LinkedListNode<int> *prev,LinkedListNode<int> *curr){
//     if(curr==NULL){
//         return prev;
//     }
//     LinkedListNode<int>* reversedHead=reverse(curr,curr->next);
//     curr->next=prev;
//     return reversedHead;
// }

//2nd approach
//In this apporach we dont used extra space for prev pointer
//approach is if we had a one node and rest list is already reversed then we need to chane the next pointer of last node of that reversed list
//and next pointer of that node so here for changing next pointer of last node we use head->next->next and for changing next
//pointer of that node we use head->next=null;
LinkedListNode<int> *reverse(LinkedListNode<int> *head){
    //base case if list is empty or list have single node
    if(head==NULL || head->next==NULL){
        return head;
    }
    LinkedListNode<int>* chotaHead=reverse(head->next);
    head->next->next=head;
    head->next=NULL;
    return chotaHead;
}

LinkedListNode<int> *reverseLinkedList(LinkedListNode<int> *head) 
{
    // Write your code here
//     LinkedListNode<int> *prev=NULL;
//     return reverse(prev,head);
    
    return reverse(head);
}