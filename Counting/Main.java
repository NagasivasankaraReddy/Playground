// CPP program to remove all the 
// characters other then alphabets 
#include <bits/stdc++.h> 
using namespace std; 

// function to remove characters and 
// print new string 
void removeSpecialCharacter(string s) 
{ 
  int count1=0;
  int count2=0;
  int count3=0;
  int count4=0;
  int count5=0;
	for (int i = 0; i < s.size(); i++) { 
		
		// Finding the character whose 
		// ASCII value fall under this 
		// range 
		if ((s[i] >='A' && s[i] <= 'Z') ||
			(s[i] >= 'a' && s[i] <= 'z') )
		{ 
			// erase function to erase 
			// the character 
			if (s[i] =='A' || s[i] == 'a' || 
              s[i] == 'E' || s[i] == 'e' || s[i] == 'I' || s[i] =='i' ||s[i] == 'O' || s[i] == 'o'  ||s[i] == 'U' || s[i] == 'u' )
              count1++;
          else
            count2++;
            
		} 
      else if(isspace(s[i]))
        count3++;
      else if(s[i]>='0' && s[i]<='9')
        count4++;
      else
        count5++;
	} 
	cout <<"Vowels:"<<count1<<"\n\
Consonants:"<<count2<<"\n\
White Spaces:"<<count3<<"\n\
Digits:"<<count4<<"\n\
Symbols:"<<count5; 
} 

// driver code 
int main() 
{ 
	string s;
  std::getline(std::cin,s);
	removeSpecialCharacter(s); 
} 
