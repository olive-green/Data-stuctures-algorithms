//printing distinct elements in an array using hash table
#include <bits/stdc++.h>
using namespace std;

void printDistinct(int arr[],int n){
    unordered_set<int>s;
    for(int i=0;i<n;i++){
        //here we are checking whether element is present in a hastable or not, if not
        // then insert it in then print that distinct element
        if(s.find(arr[i])==s.end()){
            s.insert(arr[i]);
            cout<<arr[i]<<endl;
        }
    }
}

// WE can also use simple set to store all elements, because set contains only distinct elements
void printUnique(int arr[],int n){
    set<int>s;
    for(int i=0;i<n;i++){
        s.insert(arr[i]);
    }
    for(auto it=s.begin();it!=s.end();++it){
        cout<<*it<<endl;
    }
}

//we can also use hashmap to store distinct elements in the form of key of map
void hashmapp(int arr[],int n){
    map<int , int> hm;
    for(int i=0;i<n;i++){
        hm.insert({arr[i],i});
    }
    for(auto it=hm.begin();it!=hm.end();++it){
        
        cout<<it->first<<endl;
    }
}



int main() {
	int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45};
    int n = sizeof(arr)/sizeof(int);
    // printDistinct(arr,n);
    // printUnique(arr,n);
    hashmapp(arr,n);
	return 0;
}