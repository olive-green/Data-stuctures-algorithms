/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
    public:
    int len(ListNode* head){
        int len=0;
        while(head!=NULL){
            head=head->next;
            len++;
        }
        return len;
    }
    ListNode* solve(ListNode* head, int k,int len) {
        ListNode* prev=NULL;
        ListNode* curr=head;
        ListNode* next=NULL;
        int count=0;
        while(curr!=NULL && count<k){
            next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=NULL && len-1>0){
            head->next=solve(next,k,len-1);
        }
        else{
                head->next=next;
            }
        return prev;
}
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        int length=len(head);
        int noOftimes=length/k;//no of times it should reverese the batches of elements like in n=5 ,k=2 , it is 2
        return solve(head,k,noOftimes);
    }
};