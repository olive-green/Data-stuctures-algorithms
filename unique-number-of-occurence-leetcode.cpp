#include<bits/stdc++.h>
// Given an array of integers arr, 
// return true if the number of occurrences of each value in the array is unique, or false otherwise
using namespace std;

void distinct(int arr[],int n){
      //first approach
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
        
        //above approach in sort format
        unordered_map<int,int> m;
        unordered_set<int> s;
        for(auto x:arr) m[x]++;
        for(auto x:m) s.insert(x.second);
        return m.size()==s.size();
        
// We can improve this for the average case by checking the result of s.insert(), which returns false if an element is already there.  
            for (auto n : arr) ++m[n];
            for (auto& p : m)
                 if (!s.insert(p.second).second) return false; //so here we check if the newly inserted element is already exists or not, if yes then .second returns false 
//The single element versions (1) return a pair, with its member pair::first set to an iterator pointing to either 
// the newly inserted element or to the equivalent element already in the set. The pair::second element in the pair is set to true if a new element was inserted or false if an equivalent element already existed.
            return true;

}

int main ()
{
 int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45};
    int n = sizeof(arr)/sizeof(int);
    distinct(arr,n);

  return 0;
}
