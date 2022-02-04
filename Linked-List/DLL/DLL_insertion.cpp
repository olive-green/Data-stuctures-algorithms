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
void insert_at_beg(Node* &head,int key){
    Node* newNode=new Node(key);
    if(head==NULL){
        head=newNode;
        return;
    }
    newNode->next=head;
    head->prev=newNode;
    head=newNode;
 
}
void insert_at_pos(Node* &head,int position,int key){
    Node* newNode=new Node(key);
    
    if(head==NULL){
        head=newNode;
        return;
    }
    if(position==1){
        insert_at_beg(head,key);
        return;
    }
    
    Node* prevNode=head;
    int count=1;
    while(count<position-1){
        prevNode=prevNode->next;
        count++;
    }
    newNode->next=prevNode->next;
    newNode->prev=prevNode;
    
    prevNode->next->prev=newNode;
    
    prevNode->next=newNode;
 
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
    cout<<"Before"<<endl;
    printList(head);
    
    append(head,4);
    append(head,11);
    insert_at_beg(head,12);
    insert_at_pos(head,3,47);
    cout<<"After"<<endl;
    printList(head);
}

//Output:
// Before
// 2 
// After
// 12 2 47 4 11 
