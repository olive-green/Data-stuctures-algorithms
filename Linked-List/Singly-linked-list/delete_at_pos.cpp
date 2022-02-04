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


void delete_at_pos(Node* &head,int position){
    if(position==1){
        Node* temp=head;
        head=head->next;
        delete temp;
        return;
    }
    
    int count=1;
    Node* prev=NULL;
    Node* current=head;
    while(count<position){
        prev=current;
        current=current->next;
        count++;
    }
    prev->next=current->next;
    delete current;
    
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
    
    delete_at_pos(head,1);
    cout<<"After"<<endl;
    printList(head);
}