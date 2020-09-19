#include <bits/stdc++.h>
using namespace std;

int answer(string expr){
    stack<int> mystack;
    for(char i:expr){
        if(isdigit(i))
            mystack.push(i-'0');
        else{
            int val1 = mystack.top();
            mystack.pop();
            int val2 = mystack.top();
            mystack.pop();
            switch(i){
                case '+':mystack.push(val2+val1);
                break;
                case '-':mystack.push(val2-val1);
                break;
                case '*':mystack.push(val2*val1);
                break;
                case '/':mystack.push(val2/val1);
                break;
            }
        }
    }
    return mystack.top();
}

int main() {
	int t;
	cin >> t;
	while(t--){
	    string expr;
	    cin >> expr;
	    cout << answer(expr) << endl;
	}
	return 0;
}