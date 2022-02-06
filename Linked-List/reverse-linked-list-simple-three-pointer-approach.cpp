Node* reverse( Node* head){
     Node* next = NULL;
     Node* curr = head;
     Node* prev = NULL;
  
    
    //reversal begins
    while(curr!=NULL){	
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
}