#include <bits/stdc++.h>
using namespace std;

int partition(int arr[],int s,int e)
{
    int pivot=arr[e];
    int index=s;//here we are maintaining index for swapping it with pivot this index
    //gives us the pivot index
    for(int i=s;i<=e;i++){
        if(arr[i]<pivot){
            swap(arr[index],arr[i]);
            index++;
        }
    }
    swap(arr[index],arr[e]);
    
    return index;
}

//if pivot is starting element
// int partition(int arr[],int s,int e)
// {
//     int pivot=arr[s];

    
//     int i=s+1,j=e;
//     while(i<j){
//         while(arr[i]<=pivot){
//             i++;
//         }
//         while(arr[j]>pivot){
//             j--;
//         }
//         if(i<j){
//             swap(arr[i],arr[j]);
//         }
        
//     }
//     swap(arr[j],arr[s]);
    
//     return j;
// }

//if pivot is random number
// Generates Random Pivot, swaps pivot with
// end element and calls the partition function
// int partition_r(int arr[],int s,int e)
// {
//     srand(time(0));
//     int random=s + rand()%(e-s);
//     cout<<random<<endl;
//     swap(arr[random],arr[e]);
//     return partition(arr,s,e);
// }

// Generate a random number in between
// low .. high
void quickSort(int arr[],int s,int e){
    if(s>=e){
        return;
    }
    int pi=partition(arr,s,e);
    quickSort(arr,s,pi-1);
    	
    quickSort(arr,pi+1,e);
}

int main() {
	int arr[]={3,1,11,4,9,5,2,8};
// 		for(int i=0;i<5;i++){
// 	    cout<<arr[i]<<" ";
// 	}cout<<endl;
// 	cout<<"after"<<endl;
	quickSort(arr,0,7);
	for(int i=0;i<8;i++){
	    cout<<arr[i]<<" ";
	}cout<<endl;
	return 0;
}