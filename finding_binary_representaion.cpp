#include <bits/stdc++.h>
using namespace std;


//function for finding binary representation of a number
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
	cout<<binaryNumber(5);
	return 0;
}