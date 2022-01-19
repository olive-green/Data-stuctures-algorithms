#include <bits/stdc++.h>
using namespace std;


//function for finding binary representation of a number
bool palindrome(string s,int i,int j){
    if(i>=j) return true;
    if(s[i]!=s[j]) return false;
    else
       return palindrome(s,++i,--j);
}
int main() {
    string str="abcba";
	bool ans=palindrome(str,0,4);
	cout<<ans;
	return 0;
}