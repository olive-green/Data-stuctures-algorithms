#include<bits/stdc++.h>
using namespace std;

void maxSubArray(vector < int > arr) {
   
    //print the subarray with max sum
    int s=0,e=0;
    int currSum=0,ans=INT_MIN;
    
   for(int i=0;i<arr.size();i++){
       currSum+=arr[i];
//        ans=max(currSum,ans);
       if(currSum>ans){
           ans=currSum;
           e=i;
       }
       
       if(currSum<0)
       {
           currSum=0;
           s=i+1;     
       } 

   }
    //now printing the subarray
    for(int i=s;i<=e;i++){
        cout<<arr[i]<"\t";
    }
    cout<<endl;
    cout<<"sum="<<ans<<endl;
    
}

int main() {
    vector<int> arr{-2,1,-3,4,-1,2,1,-5,4};
    maxSubArray(arr);

}