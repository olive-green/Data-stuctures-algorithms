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
};

// void append(Node* &head,int new_data){
//     Node* newNode=new Node(new_data);
//     if(head==NULL){
//         head=newNode;
//         return;
//     }
//     Node* temp=head;
//     while(temp->next!=NULL){
//         temp=temp->next;
//     }
//     temp->next=newNode;
    
// }

// 2nd method without using referencing or double pointer
Node* append(Node* head,int new_data){
    Node* newNode=new Node(new_data);
    if(head==NULL){
        head=newNode;
        return head;
    }
    Node* temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=newNode;
    return head;
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
    
    // append(head,11);
    
    //this is for 2nd method
    head=append(head,13);
    cout<<head->data<<endl;
    
    cout<<"After"<<endl;
    printList(head);
}