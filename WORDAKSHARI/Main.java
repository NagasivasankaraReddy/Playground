
#include <bits/stdc++.h> 
using namespace std; 


int wordakshari(string s,string b) 
{ 
  int n=s.size();
  if(s[n-1]==b[0])
  {
    cout<<b<<"\n";
    return 1;
  }
  else
  {
    return 0;
  }
} 


int main() 
{ 
	string s;
    std::getline(std::cin,s);
  cout<<s<<"\n";
    string b;
  std::getline(std::cin,b);
  
  int t=wordakshari(s,b); 
 
  while(t==1)
  {
    s=b;
    cin>>b;
    t=wordakshari(s,b);
    
  }
} 
