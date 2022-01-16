#include <bits/stdc++.h>
using namespace std;


// finding 2s complement of a number
int binaryNumber(int n){
    int ans=0;
    for(int i=0;n>0;i++){
        int r=n%2;
        ans=ans+pow(10,i)*r;
        n=n/2;
    }
    return ans;
}

int main() {
	int n=-5;
	n=-n;
	//first we find 1s complement
	int powerOf2=0;
	int temp=n;
	while(temp!=0){
	    powerOf2++;
	    temp=temp>>1;
	}
	powerOf2=pow(2,powerOf2);
	int ans=powerOf2-n;
	cout<<ans;
	return 0;
}