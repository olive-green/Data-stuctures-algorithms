#include <bits/stdc++.h>
using namespace std;

class Node{
    public:
        int data;
        Node* next;
        Node* prev;
    //constructor
    Node(int data){
        this->data=data;
        this->next=NULL;
        this->prev=NULL;
    }
    ~Node(){
        cout<<"deleting the value"<<this->data<<endl;
    }
};


void delete_by_value(Node* &head,int value){
    Node* valueNode=head;
    // Node* prev=NULL;
    while(valueNode!=NULL){
        if(valueNode->data==value){
            break;
        }
        valueNode=valueNode->next;
    }
    if(valueNode==NULL){
        cout<<"Element does not exist"<<endl;
        return;
    }
  
    if(valueNode==head){
        head=head->next;
        head->prev=NULL;
        delete valueNode;
        return;
    }
    
    
    //else if it not head Node
    //first make its prev node next to targeted node next
    valueNode->prev->next=valueNode->next;
    
    //if deleted node is last node , then simply delte that node no need to change its next node prev part;
    if(valueNode->next==NULL){
        delete valueNode;
        return;
    }
    else
        //similarly make its nextNode's prev to its previous Node
        valueNode->next->prev=valueNode->prev;
    
    // now simply deleted 
    delete valueNode;
    
}
void append(Node* &head,int key){
    Node* newNode=new Node(key);
    if(head==NULL){
        head=newNode;
        return;
    }
    Node* temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    newNode->prev=temp;
    temp->next=newNode;
 
}


void printList(Node* n){
    while(n!=NULL){
        cout<<n->data<<" ";
        n=n->next;
    }
    cout<<endl;
}

int main()
{
    Node* head= new Node(2);
    append(head,4);
    append(head,11);
    append(head,18);
    append(head,41);
    cout<<"Before"<<endl;
    printList(head);
    
    
    delete_by_value(head,41);
    
    cout<<"After"<<endl;
    printList(head);
}

//Output:
// Before
// 2 
// After
// 12 2 47 4 11 