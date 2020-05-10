#include <bits/stdc++.h> 
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
 
  std::string str; 
  std::getline(std::cin,str); 
  
  reverse(str.begin(), str.end()); 
  cout<<str;
}