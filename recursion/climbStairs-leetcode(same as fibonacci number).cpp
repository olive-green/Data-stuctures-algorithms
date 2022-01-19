#include <iostream>
using namespace std;

    int climbStairs(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        int result=climbStairs(n-1)+climbStairs(n-2);
        cout<<result<<endl;
        return result+1;
    }
int main() {
	cout<<"dfg"<<climbStairs(3);
	return 0;
}