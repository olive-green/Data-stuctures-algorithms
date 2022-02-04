#include <bits/stdc++.h>
using namespace std;

class Node{
    public:
        int data;
        Node* next;
    //constructor
    Node(int data){
        this->data=data;
        this->next=NULL;
    }
    ~Node(){
        cout<<"deleting the value"<<this->data<<endl;
    }
};


void delete_by_value(Node* &head,int value){
    Node* valueNode=head;
    Node* prev=NULL;
    while(valueNode!=NULL){
        if(valueNode->data==value){
            break;
        }
        prev=valueNode;
        valueNode=valueNode->next;
    }
    if(valueNode==NULL){
        cout<<"Element does not exist"<<endl;
        return;
    }
  
    if(valueNode==head){
        head=head->next;
        delete valueNode;
        return;
    }
    
    //else if it not head Node
    prev->next=valueNode->next;
    delete valueNode;
    
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
    Node* n2= new Node(5);
    head->next=n2;
    Node* n3= new Node(6);
    n2->next=n3;
    Node* n4= new Node(4);
    n3->next=n4;
    Node* n5= new Node(9);
    n4->next=n5;
    cout<<"Before"<<endl;
    printList(head);
    
    delete_by_value(head,4);
    cout<<"After"<<endl;
    printList(head);
}