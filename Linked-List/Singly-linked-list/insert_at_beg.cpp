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

void insert_at_beg(Node* &head,int new_data){
    Node* newNode=new Node(new_data);
    if(head==NULL){
        head=newNode;
        return;
    }
    newNode->next=head;
    // head->next=newNode; don't do above mistake bcz we have to point head pointer to newNode not have to change its next member to newNode
    head=newNode;
    
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
    
    insert_at_beg(head,15);
    cout<<"After"<<endl;
    printList(head);
}