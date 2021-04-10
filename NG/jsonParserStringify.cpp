/*
{"a":{"name":"john"}}
2
*/



#include <iostream>

using namespace std;
int maxDept(string s) {
		
		int currentCount = 0;
		int max = 0;
		int n = s.length();
		
		for(int i = 0; i < n; i++) {
			if (s[i] == '('  || s[i] == '{' || s[i] =='[') {
				currentCount++;
				if ( currentCount > max) {
					max = currentCount;
				}
			}
			else if (s[i] == ')'  || s[i] == '}' || s[i] == ']') {
				if (currentCount>0) {
					currentCount--;
				}
				else {
					return -1;
				}
			}
		}
		if (currentCount != 0){
		    return -1;
		}
		return max;
		
	}
int main()
{
    string s;
    getline(cin, s);
    std::cout << maxDept(s) << std::endl;
}
