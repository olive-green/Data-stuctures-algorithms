#include <bits/stdc++.h>
using namespace std;
int main() {
	//char to int conversion
	char c='9'
    int i;
    i=c - '0';
    cout<<i<<endl;
    
    //string to int conversion
	string s="123";
    i=stoi(s);
    
    //int to char conversion
    int j=2;
    string x= to_string(j);
    char y=x[0];
    cout<<x<<endl;
    cout<<y<<endl;
	return 0;
}