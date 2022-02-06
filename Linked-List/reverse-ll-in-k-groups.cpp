

Node* kReverse(Node* head, int k) {
    //base case
    if(head==NULL){
        return head;
    }
    //else aage karo
    
    //Step-1: reverse first k nodes
    
    Node* next = NULL;
    Node* curr = head;
    Node* prev = NULL;
    int count = 0;
    
    //reversal begins
    while(curr!=NULL && count<k){	//count < k so tat only k nodes reverse karni hai
        next = curr->next;
        curr->next = prev;	//peeche point karo
        //move ptr ahead
        prev = curr;
        curr = next;
        count++;	//count ko bada do
    }	// k nodes reverse, now ahead
    
    //STEP-2: Recursion dekh lega
    if(next!=NULL){
        head->next = kReverse(next, k);
        //aage wala part reverse ho gya
    }
    
    //STEP-3: return head of reversed list	=> prev pe hoga head of rev LL
    return prev;
}