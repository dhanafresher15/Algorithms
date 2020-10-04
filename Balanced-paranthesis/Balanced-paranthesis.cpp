#include <bits/stdc++.h>
using namespace std;

bool isMatching(char current,char popped){
    switch(current){
        case '}': return popped == '{';
        case ']': return popped == '[';
        case ')': return popped == '(';
    }
    return false;
}

bool isBalanced(string str){
    stack<char> s;
    char x;
    for(int i=0; i<str.size();i++){
        if(str[i]=='('||str[i]=='{'||str[i]=='[')
            s.push(str[i]);
        else if(s.empty() || !isMatching(str[i],s.top()))
            return false;
        else
            s.pop();
    }
    return s.empty();
}

int main() {
	int t;
	cin >> t;
	while(t--){
	    string str;
	    cin >> str;
	    if(isBalanced(str))
	        cout << "balanced" << endl;
	    else
	        cout << "not balanced" << endl;
	}
	return 0;
}
