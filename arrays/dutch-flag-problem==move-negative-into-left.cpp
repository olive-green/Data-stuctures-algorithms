#include <bits/stdc++.h>
using namespace std;

void rearrange(int arr[],int n) {
        int i=0;
        int j=n-1;
       
        while(i<j){
            if(arr[i]>=0){
                swap(arr[i],arr[j]);
                j--;
            }
            else 
             i++;
        }
    }
int main() {
	int arr[] = {0,1, 2, -3, 4, 5, 6, -7, 8, -9 };
    int n = sizeof(arr) / sizeof(arr[0]);
    rearrange(arr, n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
	return 0;
}