#include <bits/stdc++.h>
using namespace std;

int power(int x,int y){
    if(y==0)
        return 1;
    return x * power(x,--y);
}

int main() {
	int ans=power(7,3);
	cout<<ans;
	return 0;
}