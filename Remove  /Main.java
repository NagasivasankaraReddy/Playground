// CPP program to remove all the 
// characters other then alphabets 
#include <bits/stdc++.h> 
using namespace std; 

// function to remove characters and 
// print new string 
void removeSpecialCharacter(string s) 
{ 
	for (int i = 0; i < s.size(); i++) { 
		
		// Finding the character whose 
		// ASCII value fall under this 
		// range 
		if (s[i] =='t'&& 
			s[i+1]== 'h' &&s[i+2] == 'e') 
		{ 
			// erase function to erase 
			// the character 
			s.erase(i, 4); 
          
			i--; 
		} 
	} 
	cout << s; 
} 

// driver code 
int main() 
{ 
	string s;
   std::getline(std::cin,s);
	removeSpecialCharacter(s); 
	return 0; 
} 
