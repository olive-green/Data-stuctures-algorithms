#include<bits/stdc++.h>
// Given an array of integers arr, 
// return true if the number of occurrences of each value in the array is unique, or false otherwise
using namespace std;

void distinct(int arr[],int n){
    set<int> s;
        map<int,int>hm;
        for(int i=0;i<arr.size();++i){
            if(hm.find(arr[i])==hm.end()){
                hm.insert({arr[i],1});
            }
            else{
                hm.at(arr[i])+=1;
            }
        }
        for (auto& x: hm) {
            s.insert(x.second);
            }
        if(hm.size()==s.size()){
            return true;
        }
        return false;
}

int main ()
{
 int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45};
    int n = sizeof(arr)/sizeof(int);
    distinct(arr,n);

  return 0;
}